package app.website.api.customer;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
public class CreateCustomerAJAXResponse {
    @NotNull
    @NotBlank
    @Property(name = "email")
    public String email;

    @NotNull
    @NotBlank
    @Property(name = "first_name")
    public String firstName;

    @NotNull
    @Property(name = "create_time")
    public ZonedDateTime createTime;
}
