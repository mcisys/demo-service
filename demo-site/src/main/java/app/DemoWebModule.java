package app;

import app.demo.bo.api.BOCustomerWebService;
import app.web.IndexController;
import core.framework.module.Module;

import static core.framework.http.HTTPMethod.GET;

/**
 * @author jack.lian
 */
public class DemoWebModule extends Module {
    @Override
    protected void initialize() {
        loadProperties("app.properties");
        api().client(BOCustomerWebService.class, requiredProperty("app.bo.customer.service"));

        IndexController indexController = bind(IndexController.class);
        http().route(GET, "/", indexController::index);
        http().route(GET, "/customer/:id", indexController::getCustomer);
    }
}
