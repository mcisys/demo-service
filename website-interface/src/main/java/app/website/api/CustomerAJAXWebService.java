package app.website.api;

import app.website.api.customer.CreateCustomerAJAXRequest;
import app.website.api.customer.CreateCustomerAJAXResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author jack.lian
 */
public interface CustomerAJAXWebService {
    @POST
    @Path("/ajax/customer")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateCustomerAJAXResponse create(CreateCustomerAJAXRequest request);
}
