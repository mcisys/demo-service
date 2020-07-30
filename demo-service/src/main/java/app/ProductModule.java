package app;

import app.demo.api.ProductWebService;
import app.demo.api.product.kafka.ProductUpdateMessage;
import app.demo.product.domain.Product;
import app.demo.product.kafka.ProductUpdateMessageHandler;
import app.demo.product.service.ProductService;
import app.demo.product.web.ProductUpdateMessageTestController;
import app.demo.product.web.ProductWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

import static core.framework.http.HTTPMethod.GET;

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

        configureKafka();
    }

    private void configureKafka() {
        kafka().uri("localhost:9092");

        kafka().subscribe("product-updated", ProductUpdateMessage.class, bind(ProductUpdateMessageHandler.class));
        kafka().poolSize(2);

        kafka().publish("product-updated", ProductUpdateMessage.class);
        http().route(GET, "/kafka-test", bind(ProductUpdateMessageTestController.class)::kafkaTest);
    }

}
