package app.demo.bo.customer.web;

import app.demo.bo.api.BOCustomerWebService;
import app.demo.bo.api.customer.BOCustomerView;
import app.demo.bo.customer.service.BOCustomerService;
import core.framework.inject.Inject;

/**
 * @author jack.lian
 */
public class BOCustomerWebServiceImpl implements BOCustomerWebService {
    @Inject
    BOCustomerService boCustomerService;

    @Override
    public BOCustomerView get(Long id) {
        return boCustomerService.get(id);
    }
}
