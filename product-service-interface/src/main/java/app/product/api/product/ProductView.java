package app.product.api.product;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
public class ProductView {
    @NotNull
    @Property(name = "id")
    public String id;

    @NotNull
    @NotBlank
    @Property(name = "name")
    public String name;

    @NotNull
    @NotBlank
    @Property(name = "desc")
    public String description;

    @NotNull
    @Property(name = "create_time")
    public ZonedDateTime createTime;

    @NotNull
    @Property(name = "created_by")
    public String createdBy;

    @NotNull
    @Property(name = "updated_time")
    public ZonedDateTime updatedTime;

    @NotNull
    @Property(name = "updated_by")
    public String updatedBy;
}
