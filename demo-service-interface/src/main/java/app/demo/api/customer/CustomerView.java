package app.demo.api.customer;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
public class CustomerView {
    @NotNull
    @Property(name = "id")
    public Long id;

    @NotNull
    @NotBlank
    @Property(name = "email")
    public String email;

    @NotNull
    @NotBlank
    @Property(name = "first_name")
    public String firstName;

    @NotBlank
    @Property(name = "last_name")
    public String lastName;

    @NotNull
    @Property(name = "create_time")
    public ZonedDateTime createTime;

    @NotNull
    @Property(name = "updated_time")
    public ZonedDateTime updatedTime;
}
