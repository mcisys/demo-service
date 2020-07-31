package app.customer.api;

import app.customer.api.customer.CreateCustomerRequest;
import app.customer.api.customer.CustomerView;
import app.customer.api.customer.SearchCustomerRequest;
import app.customer.api.customer.SearchCustomerResponse;
import app.customer.api.customer.UpdateCustomerRequest;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author jack.lian
 */
public interface CustomerWebService {
    @GET
    @Path("/customer/:id")
    CustomerView get(@PathParam("id") Long id);

    @POST
    @Path("/customer")
    @ResponseStatus(HTTPStatus.CREATED)
    CustomerView create(CreateCustomerRequest request);

    @PUT
    @Path("/customer/:id")
    void update(@PathParam("id") Long id, UpdateCustomerRequest request);

    @PUT
    @Path("/customer")
    SearchCustomerResponse search(SearchCustomerRequest request);

    @DELETE
    @Path("/customer/:id")
    void delete(@PathParam("id") Long id);
}
