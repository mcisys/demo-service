package app.web;

import app.customer.api.CustomerWebService;
import app.customer.api.customer.CreateCustomerRequest;
import app.customer.api.customer.CustomerView;
import app.website.api.CustomerAJAXWebService;
import app.website.api.customer.CreateCustomerAJAXRequest;
import app.website.api.customer.CreateCustomerAJAXResponse;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;

/**
 * @author jack.lian
 */
public class CustomerAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    CustomerWebService customerWebService;

    @Override
    public CreateCustomerAJAXResponse create(CreateCustomerAJAXRequest request) {
        ActionLogContext.put("email", request.email);
        ActionLogContext.put("first_name", request.firstName);
        CreateCustomerAJAXResponse response = new CreateCustomerAJAXResponse();
        CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest();
        createCustomerRequest.email = request.email;
        createCustomerRequest.firstName = request.firstName;
        createCustomerRequest.lastName = request.lastName;
        CustomerView customerView = customerWebService.create(createCustomerRequest);
        response.email = customerView.email;
        response.firstName = customerView.firstName;
        response.createTime = customerView.createTime;
        return response;
    }
}
