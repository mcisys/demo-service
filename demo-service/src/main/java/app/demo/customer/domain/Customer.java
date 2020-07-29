package app.demo.customer.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.db.Column;
import core.framework.db.PrimaryKey;
import core.framework.db.Table;

import java.time.ZonedDateTime;

/**
 * @author jack.lian
 */
@Table(name = "customers")
public class Customer {
    @PrimaryKey(autoIncrement = true)
    @Column(name = "id")
    public Long id;

    @NotNull
    @Column(name = "status")
    public CustomerStatus status;

    @NotNull
    @NotBlank
    @Column(name = "email")
    public String email;

    @NotNull
    @NotBlank
    @Column(name = "first_name")
    public String firstName;

    @NotNull
    @NotBlank
    @Column(name = "last_name")
    public String lastName;

    @NotNull
    @Column(name = "create_time")
    public ZonedDateTime createTime;

    @NotNull
    @Column(name = "updated_time")
    public ZonedDateTime updatedTime;
}
