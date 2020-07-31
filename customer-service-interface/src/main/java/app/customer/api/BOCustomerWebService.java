package app.customer.api;

import app.customer.api.customer.BOCustomerView;
import app.customer.api.customer.BOUpdateCustomerRequest;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author jack.lian
 */
public interface BOCustomerWebService {
    @GET
    @Path("/bo/customer/:id")
    BOCustomerView get(@PathParam("id") Long id);

    @PUT
    @Path("/bo/customer/:id")
    void update(@PathParam("id") Long id, BOUpdateCustomerRequest request);
}
