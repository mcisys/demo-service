package app.bo.customer.web;

import app.bo.api.CustomerAJAXWebService;
import app.bo.api.customer.UpdateCustomerAJAXRequest;
import app.customer.api.BOCustomerWebService;
import app.customer.api.customer.BOUpdateCustomerRequest;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;

/**
 * @author jack.lian
 */
public class CustomerAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    BOCustomerWebService boCustomerService;

    @Override
    public void update(Long id, UpdateCustomerAJAXRequest request) {
        ActionLogContext.put("id", id);
        ActionLogContext.put("first_name", request.firstName);
        BOUpdateCustomerRequest boUpdateCustomerRequest = new BOUpdateCustomerRequest();
        boUpdateCustomerRequest.firstName = request.firstName;
        boUpdateCustomerRequest.lastName = request.lastName;
        boCustomerService.update(id, boUpdateCustomerRequest);
    }
}
