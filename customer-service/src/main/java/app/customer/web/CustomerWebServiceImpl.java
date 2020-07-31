package app.customer.web;

import app.customer.api.CustomerWebService;
import app.customer.api.customer.CreateCustomerRequest;
import app.customer.api.customer.CustomerView;
import app.customer.api.customer.SearchCustomerRequest;
import app.customer.api.customer.SearchCustomerResponse;
import app.customer.api.customer.UpdateCustomerRequest;
import app.customer.service.CustomerService;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;

/**
 * @author jack.lian
 */
public class CustomerWebServiceImpl implements CustomerWebService {
    @Inject
    CustomerService customerService;

    @Override
    public CustomerView get(Long id) {
        return customerService.get(id);
    }

    @Override
    public CustomerView create(CreateCustomerRequest request) {
        ActionLogContext.put("email", request.email);
        ActionLogContext.put("first_name", request.firstName);
        return customerService.create(request);
    }

    @Override
    public void update(Long id, UpdateCustomerRequest request) {
        ActionLogContext.put("id", id);
        ActionLogContext.put("first_name", request.firstName);
        customerService.update(id, request);
    }

    @Override
    public SearchCustomerResponse search(SearchCustomerRequest request) {
        return customerService.search(request);
    }

    @Override
    public void delete(Long id) {
        ActionLogContext.put("id", id);
        customerService.delete(id);
    }
}
