package app.product.web;

import app.product.api.ProductWebService;
import app.product.api.product.CreateProductRequest;
import app.product.api.product.ProductView;
import app.product.api.product.SearchProductRequest;
import app.product.api.product.SearchProductResponse;
import app.product.api.product.UpdateProductRequest;
import app.product.service.ProductService;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;

/**
 * @author jack.lian
 */
public class ProductWebServiceImpl implements ProductWebService {
    @Inject
    ProductService productService;

    @Override
    public ProductView get(String id) {
        return productService.get(id);
    }

    @Override
    public void create(CreateProductRequest request) {
        ActionLogContext.put("name", request.name);
        ActionLogContext.put("operator", request.operator);
        productService.create(request);
    }

    @Override
    public void delete(String id) {
        ActionLogContext.put("id", id);
        productService.delete(id);
    }

    @Override
    public SearchProductResponse search(SearchProductRequest request) {
        return productService.search(request);
    }

    @Override
    public void update(String id, UpdateProductRequest request) {
        ActionLogContext.put("id", id);
        ActionLogContext.put("name", request.name);
        ActionLogContext.put("operator", request.operator);
        productService.update(id, request);
    }
}
