package app.demo.product.web;

import app.demo.api.product.kafka.ProductUpdateMessage;
import core.framework.inject.Inject;
import core.framework.kafka.MessagePublisher;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author jack.lian
 */
public class ProductUpdateMessageTestController {
    @Inject
    MessagePublisher<ProductUpdateMessage> publisher;

    public Response kafkaTest(Request request) {
        ProductUpdateMessage value = new ProductUpdateMessage();
        value.id = String.valueOf(1);
        value.name = "name";
        publisher.publish(value.id, value);
        return Response.empty();
    }
}
