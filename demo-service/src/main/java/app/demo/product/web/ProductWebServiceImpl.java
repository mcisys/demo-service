package app.demo.product.web;

import app.demo.api.ProductWebService;
import app.demo.api.product.CreateProductRequest;
import app.demo.api.product.ProductView;
import app.demo.api.product.SearchProductRequest;
import app.demo.api.product.SearchProductResponse;
import app.demo.api.product.UpdateProductRequest;
import app.demo.product.service.ProductService;
import core.framework.inject.Inject;

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
        productService.create(request);
    }

    @Override
    public void delete(String id) {
        productService.delete(id);
    }

    @Override
    public SearchProductResponse search(SearchProductRequest request) {
        return productService.search(request);
    }

    @Override
    public void update(String id, UpdateProductRequest request) {
        productService.update(id, request);
    }
}
