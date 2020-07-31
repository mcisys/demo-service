package app;

import app.customer.api.CustomerWebService;
import app.web.CustomerAJAXWebServiceImpl;
import app.web.IndexController;
import app.website.api.CustomerAJAXWebService;
import core.framework.module.Module;

import static core.framework.http.HTTPMethod.GET;

/**
 * @author jack.lian
 */
public class WebsiteModule extends Module {
    @Override
    protected void initialize() {
        loadProperties("app.properties");
        api().client(CustomerWebService.class, requiredProperty("app.customerServiceUrl"));
        api().service(CustomerAJAXWebService.class, bind(CustomerAJAXWebServiceImpl.class));

        IndexController indexController = bind(IndexController.class);
        http().route(GET, "/", indexController::index);
    }
}
