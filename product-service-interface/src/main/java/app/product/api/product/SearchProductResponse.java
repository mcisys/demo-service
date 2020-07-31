package app.product.api.product;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author jack.lian
 */
public class SearchProductResponse {
    @Property(name = "total")
    public Long total;

    @Property(name = "products")
    public List<ProductView> products;
}
