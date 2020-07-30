package app.demo.bo.customer.service;

import app.demo.bo.api.customer.BOCustomerView;
import app.demo.bo.api.customer.BOUpdateCustomerRequest;
import app.demo.bo.customer.domain.BOCustomer;
import core.framework.db.Repository;
import core.framework.inject.Inject;
import core.framework.web.exception.NotFoundException;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
public class BOCustomerService {
    @Inject
    Repository<BOCustomer> repository;

    public BOCustomerView get(Long id) {
        BOCustomer boCustomer = repository.get(id).orElseThrow(() -> new NotFoundException("customer not found, id=" + id));
        return view(boCustomer);
    }

    public void update(Long id, BOUpdateCustomerRequest request) {
        BOCustomer customer = repository.get(id).orElseThrow(() -> new NotFoundException("customer not found, id=" + id));
        customer.updatedTime = ZonedDateTime.now();
        customer.firstName = request.firstName;
        if (request.lastName != null) {
            customer.lastName = request.lastName;
        }
        repository.partialUpdate(customer);
    }

    private BOCustomerView view(BOCustomer boCustomer) {
        BOCustomerView boCustomerView = new BOCustomerView();
        boCustomerView.id = boCustomer.id;
        boCustomerView.email = boCustomer.email;
        boCustomerView.firstName = boCustomer.firstName;
        boCustomerView.lastName = boCustomer.lastName;
        return boCustomerView;
    }
}
