package app;

import app.customer.api.BOCustomerWebService;
import app.customer.api.CustomerWebService;
import app.customer.domain.Customer;
import app.customer.service.BOCustomerService;
import app.customer.service.CustomerService;
import app.customer.web.BOCustomerWebServiceImpl;
import app.customer.web.CustomerWebServiceImpl;
import core.framework.module.Module;

/**
 * @author jack.lian
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Customer.class);
        bind(CustomerService.class);
        bind(BOCustomerService.class);
        api().service(CustomerWebService.class, bind(CustomerWebServiceImpl.class));
        api().service(BOCustomerWebService.class, bind(BOCustomerWebServiceImpl.class));
    }
}
