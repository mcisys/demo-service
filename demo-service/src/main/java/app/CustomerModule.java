package app;

import app.demo.customer.domain.Customer;
import app.demo.customer.service.CustomerService;
import app.demo.customer.web.CustomerWebServiceImpl;
import app.demo.api.CustomerWebService;
import core.framework.module.Module;

/**
 * @author jack.lian
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Customer.class);
        bind(CustomerService.class);
        api().service(CustomerWebService.class, bind(CustomerWebServiceImpl.class));
    }
}
