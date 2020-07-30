package app.demo.api.product;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author jack.lian
 */
public class CreateProductRequest {
    @NotNull(message = "name is required")
    @NotBlank
    @Property(name = "name")
    public String name;

    @NotNull(message = "description is required")
    @NotBlank
    @Property(name = "desc")
    public String description;

    @NotNull
    @NotBlank
    @Property(name = "operator")
    public String operator;
}
