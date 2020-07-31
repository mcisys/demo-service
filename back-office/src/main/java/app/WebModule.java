package app;

import app.bo.api.CustomerAJAXWebService;
import app.bo.customer.web.CustomerAJAXWebServiceImpl;
import app.customer.api.BOCustomerWebService;
import core.framework.module.Module;

/**
 * @author jack.lian
 */
public class WebModule extends Module {
    @Override
    protected void initialize() {
        api().client(BOCustomerWebService.class, requiredProperty("app.customerServiceUrl"));
        api().service(CustomerAJAXWebService.class, bind(CustomerAJAXWebServiceImpl.class));
    }
}
