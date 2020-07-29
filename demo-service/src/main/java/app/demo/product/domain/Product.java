package app.demo.product.domain;

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

    @Field(name = "name")
    public String name;

    @Field(name = "desc")
    public String description;

    @Field(name = "create_time")
    public ZonedDateTime createTime;

    @Field(name = "updated_time")
    public ZonedDateTime updatedTime;
}
