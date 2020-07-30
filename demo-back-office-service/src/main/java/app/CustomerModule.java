package app;

import app.demo.bo.api.BOCustomerWebService;
import app.demo.bo.api.CustomerAJAXWebService;
import app.demo.bo.customer.domain.BOCustomer;
import app.demo.bo.customer.service.BOCustomerService;
import app.demo.bo.customer.web.BOCustomerWebServiceImpl;
import app.demo.bo.customer.web.CustomerAJAXWebServiceImpl;
import core.framework.module.Module;

/**
 * @author jack.lian
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        db().repository(BOCustomer.class);
        bind(BOCustomerService.class);
        api().service(BOCustomerWebService.class, bind(BOCustomerWebServiceImpl.class));
        api().service(CustomerAJAXWebService.class, bind(CustomerAJAXWebServiceImpl.class));
    }
}
