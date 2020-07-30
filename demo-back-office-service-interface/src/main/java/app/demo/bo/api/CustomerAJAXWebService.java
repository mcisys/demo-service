package app.demo.bo.api;

import app.demo.bo.api.customer.UpdateCustomerAJAXRequest;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author jack.lian
 */
public interface CustomerAJAXWebService {
    @PUT
    @Path("/ajax/customer/:id")
    void update(@PathParam("id") Long id, UpdateCustomerAJAXRequest request);
}
