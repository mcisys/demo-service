package app;

import app.product.api.ProductWebService;
import app.product.api.product.kafka.ProductUpdateMessage;
import app.product.domain.Product;
import app.product.kafka.ProductUpdateMessageHandler;
import app.product.service.ProductService;
import app.product.web.ProductWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

/**
 * @author jack.lian
 */
public class ProductModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig mongo = config(MongoConfig.class);
        mongo.uri(requiredProperty("sys.mongo.uri"));
        mongo.collection(Product.class);

        configureKafka();

        bind(ProductService.class);
        api().service(ProductWebService.class, bind(ProductWebServiceImpl.class));
    }

    private void configureKafka() {
        kafka().uri(requiredProperty("sys.kafka.url"));

        kafka().subscribe("product-updated", ProductUpdateMessage.class, bind(ProductUpdateMessageHandler.class));
        kafka().poolSize(2);

        kafka().publish("product-updated", ProductUpdateMessage.class);
    }
}
