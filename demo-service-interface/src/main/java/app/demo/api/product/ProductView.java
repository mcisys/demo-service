package app.demo.api.product;

import core.framework.api.json.Property;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
public class ProductView {
    @Property(name = "id")
    public String id;

    @Property(name = "name")
    public String name;

    @Property(name = "desc")
    public String description;

    @Property(name = "create_time")
    public ZonedDateTime createTime;

    @Property(name = "updated_time")
    public ZonedDateTime updatedTime;
}
