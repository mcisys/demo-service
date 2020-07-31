package app.customer.web;

import app.customer.api.BOCustomerWebService;
import app.customer.api.customer.BOCustomerView;
import app.customer.api.customer.BOUpdateCustomerRequest;
import app.customer.service.BOCustomerService;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;

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

    @Override
    public void update(Long id, BOUpdateCustomerRequest request) {
        ActionLogContext.put("id", id);
        ActionLogContext.put("first_name", request.firstName);
        boCustomerService.update(id, request);
    }
}
