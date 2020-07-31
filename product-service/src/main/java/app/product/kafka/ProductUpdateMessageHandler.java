package app.product.kafka;

import app.product.api.product.kafka.ProductUpdateMessage;
import core.framework.kafka.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jack.lian
 */
public class ProductUpdateMessageHandler implements MessageHandler<ProductUpdateMessage> {
    private final Logger logger = LoggerFactory.getLogger(ProductUpdateMessageHandler.class);

    @Override
    public void handle(String key, ProductUpdateMessage value) throws Exception {
        logger.warn("product-service,{},{},{}", key, value.id, value.name);
    }
}
