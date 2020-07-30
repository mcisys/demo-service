package app.demo.product.service;

import app.demo.api.product.CreateProductRequest;
import app.demo.api.product.ProductView;
import app.demo.api.product.SearchProductRequest;
import app.demo.api.product.SearchProductResponse;
import app.demo.api.product.UpdateProductRequest;
import app.demo.product.domain.Product;
import com.mongodb.ReadPreference;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import core.framework.inject.Inject;
import core.framework.mongo.Count;
import core.framework.mongo.MongoCollection;
import core.framework.mongo.Query;
import core.framework.util.Strings;
import core.framework.web.exception.NotFoundException;
import org.bson.conversions.Bson;

import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author jack.lian
 */
public class ProductService {
    @Inject
    MongoCollection<Product> collection;

    public ProductView get(String id) {
        Product product = collection.get(id).orElseThrow(() -> new NotFoundException("product not found, id=" + id));
        ProductView productView = new ProductView();
        productView.id = product.id;
        productView.name = product.name;
        productView.description = product.description;
        productView.createTime = product.createTime;
        productView.createdBy = product.createdBy;
        productView.updatedTime = product.updatedTime;
        productView.updatedBy = product.updatedBy;
        return productView;
    }

    public void create(CreateProductRequest request) {
        Product product = new Product();
        product.id = UUID.randomUUID().toString();
        product.name = request.name;
        product.description = request.description;
        product.createTime = ZonedDateTime.now();
        product.createdBy = request.operator;
        product.updatedTime = product.createTime;
        product.updatedBy = request.operator;
        collection.insert(product);
    }

    public void delete(String id) {
        collection.delete(id);
    }

    public SearchProductResponse search(SearchProductRequest request) {
        SearchProductResponse result = new SearchProductResponse();
        Query query = new Query();
        Count count = new Count();
        if (!Strings.isBlank(request.name)) {
            query.filter = Filters.eq("name", request.name);
            count.filter = Filters.eq("name", request.name);
        }
        query.skip = request.skip;
        query.limit = request.limit;
        query.readPreference = ReadPreference.secondaryPreferred();
        count.readPreference = ReadPreference.secondaryPreferred();
        result.products = collection.find(query).stream().map(this::view).collect(Collectors.toList());
        result.total = collection.count(count);
        return result;
    }

    public void update(String id, UpdateProductRequest request) {
        Bson filter = Filters.eq("_id", id);
        Bson update = Updates.combine(Updates.set("name", request.name),
            Updates.set("desc", request.description),
            Updates.set("updated_time", ZonedDateTime.now()),
            Updates.set("updated_by", request.operator));
        collection.update(filter, update);
    }

    private ProductView view(Product product) {
        ProductView productView = new ProductView();
        productView.id = product.id;
        productView.name = product.name;
        productView.description = product.description;
        productView.createTime = product.createTime;
        productView.createdBy = product.createdBy;
        productView.updatedTime = product.updatedTime;
        productView.updatedBy = product.updatedBy;
        return productView;
    }
}
