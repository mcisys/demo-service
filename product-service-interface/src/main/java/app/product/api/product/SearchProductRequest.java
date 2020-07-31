package app.product.api.product;

import core.framework.api.json.Property;
import core.framework.api.validate.NotNull;

/**
 * @author jack.lian
 */
public class SearchProductRequest {
    @NotNull
    @Property(name = "skip")
    public Integer skip = 0;

    @NotNull
    @Property(name = "limit")
    public Integer limit = 1000;

    @Property(name = "name")
    public String name;
}
