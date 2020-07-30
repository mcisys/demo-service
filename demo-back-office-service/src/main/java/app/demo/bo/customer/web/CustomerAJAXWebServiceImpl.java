package app.demo.bo.customer.web;

import app.demo.bo.api.CustomerAJAXWebService;
import app.demo.bo.api.customer.BOUpdateCustomerRequest;
import app.demo.bo.api.customer.UpdateCustomerAJAXRequest;
import app.demo.bo.customer.service.BOCustomerService;
import core.framework.inject.Inject;

/**
 * @author jack.lian
 */
public class CustomerAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    BOCustomerService boCustomerService;

    @Override
    public void update(Long id, UpdateCustomerAJAXRequest request) {
        BOUpdateCustomerRequest boUpdateCustomerRequest = new BOUpdateCustomerRequest();
        boUpdateCustomerRequest.firstName = request.firstName;
        boUpdateCustomerRequest.lastName = request.lastName;
        boCustomerService.update(id, boUpdateCustomerRequest);
    }
}
