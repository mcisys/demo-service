package app;

import app.demo.bo.api.product.ProductUpdateMessage;
import app.demo.bo.product.ProductUpdateMessageHandler;
import core.framework.module.Module;

/**
 * @author jack.lian
 */
public class ProductModule extends Module {
    @Override
    protected void initialize() {
        kafka().uri(requiredProperty("sys.kafka.url"));

        kafka().subscribe("product-updated", ProductUpdateMessage.class, bind(ProductUpdateMessageHandler.class));
        kafka().poolSize(2);
    }
}
