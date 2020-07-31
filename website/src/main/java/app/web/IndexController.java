package app.web;

import core.framework.web.Request;
import core.framework.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jack.lian
 */
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(IndexController.class);

    public Response index(Request request) {
        logger.warn("hello world");
        return Response.text("index page");
    }
}
