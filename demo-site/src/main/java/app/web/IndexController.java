package app.web;

import app.demo.bo.api.BOCustomerWebService;
import core.framework.inject.Inject;
import core.framework.web.Request;
import core.framework.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jack.lian
 */
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Inject
    BOCustomerWebService boCustomerWebService;

    public Response index(Request request) {
        logger.warn("hello world");
        return Response.text("index page");
    }

    public Response getCustomer(Request request) {
        return Response.bean(boCustomerWebService.get(Long.parseLong(request.pathParam("id"))));
    }
}
