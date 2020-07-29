package app.demo.bo.api;

import app.demo.bo.api.customer.BOCustomerView;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author jack.lian
 */
public interface BOCustomerWebService {
    @GET
    @Path("/bo/customer/:id")
    BOCustomerView get(@PathParam("id") Long id);
}
