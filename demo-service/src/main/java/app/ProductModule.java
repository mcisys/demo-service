package app;

import app.demo.api.ProductWebService;
import app.demo.product.domain.Product;
import app.demo.product.service.ProductService;
import app.demo.product.web.ProductWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

/**
 * @author jack.lian
 */
public class ProductModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig mongo = config(MongoConfig.class);
        mongo.uri("mongodb://localhost:27017/test");
        mongo.collection(Product.class);

        bind(ProductService.class);
        api().service(ProductWebService.class, bind(ProductWebServiceImpl.class));
    }
}
