package app;

import app.demo.bo.api.BOCustomerWebService;
import app.demo.bo.customer.domain.BOCustomer;
import app.demo.bo.customer.service.BOCustomerService;
import app.demo.bo.customer.web.BOCustomerWebServiceImpl;
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
    }
}
