package app.product.api.product.kafka;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author jack.lian
 */
public class ProductUpdateMessage {
    @NotNull(message = "id is required")
    @Property(name = "id")
    public String id;

    @NotBlank
    @Property(name = "name")
    public String name;
}
