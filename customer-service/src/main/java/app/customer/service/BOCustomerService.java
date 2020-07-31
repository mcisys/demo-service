package app.customer.service;

import app.customer.api.customer.BOCustomerView;
import app.customer.api.customer.BOUpdateCustomerRequest;
import app.customer.domain.Customer;
import core.framework.db.Repository;
import core.framework.inject.Inject;
import core.framework.web.exception.NotFoundException;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
public class BOCustomerService {
    @Inject
    Repository<Customer> repository;

    public BOCustomerView get(Long id) {
        Customer boCustomer = repository.get(id).orElseThrow(() -> new NotFoundException("customer not found, id=" + id, "GET_CUSTOMER_NOT_FOUND_BO"));
        return view(boCustomer);
    }

    public void update(Long id, BOUpdateCustomerRequest request) {
        Customer customer = repository.get(id).orElseThrow(() -> new NotFoundException("customer not found, id=" + id, "UPDATE_CUSTOMER_NOT_FOUND_BO"));
        customer.updatedTime = ZonedDateTime.now();
        customer.firstName = request.firstName;
        customer.lastName = request.lastName;
        repository.partialUpdate(customer);
    }

    private BOCustomerView view(Customer customer) {
        BOCustomerView boCustomerView = new BOCustomerView();
        boCustomerView.id = customer.id;
        boCustomerView.email = customer.email;
        boCustomerView.firstName = customer.firstName;
        boCustomerView.lastName = customer.lastName;
        return boCustomerView;
    }
}
