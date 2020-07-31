package app.product.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.mongo.Collection;
import core.framework.mongo.Field;
import core.framework.mongo.Id;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
@Collection(name = "products")
public class Product {
    @Id
    public String id;

    @NotNull
    @NotBlank
    @Field(name = "name")
    public String name;

    @NotNull
    @NotBlank
    @Field(name = "desc")
    public String description;

    @NotNull
    @Field(name = "create_time")
    public ZonedDateTime createTime;

    @NotNull
    @Field(name = "created_by")
    public String createdBy;

    @NotNull
    @Field(name = "updated_time")
    public ZonedDateTime updatedTime;

    @NotNull
    @Field(name = "updated_by")
    public String updatedBy;

}
