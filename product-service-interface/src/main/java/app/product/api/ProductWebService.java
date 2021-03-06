package app.product.api;

import app.product.api.product.CreateProductRequest;
import app.product.api.product.ProductView;
import app.product.api.product.SearchProductRequest;
import app.product.api.product.SearchProductResponse;
import app.product.api.product.UpdateProductRequest;
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
public interface ProductWebService {

    @GET
    @Path("/product/:id")
    ProductView get(@PathParam("id") String id);

    @POST
    @Path("/product")
    @ResponseStatus(HTTPStatus.CREATED)
    void create(CreateProductRequest request);

    @DELETE
    @Path("/product/:id")
    void delete(@PathParam("id") String id);

    @PUT
    @Path("/product")
    SearchProductResponse search(SearchProductRequest request);

    @PUT
    @Path("/product/:id")
    void update(@PathParam("id") String id, UpdateProductRequest request);
}
