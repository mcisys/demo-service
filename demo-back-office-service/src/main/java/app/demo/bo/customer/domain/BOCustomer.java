package app.demo.bo.customer.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.db.Column;
import core.framework.db.PrimaryKey;
import core.framework.db.Table;

/**
 * @author jack.lian
 */
@Table(name = "customers")
public class BOCustomer {
    @PrimaryKey(autoIncrement = true)
    @Column(name = "id")
    public Long id;

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
}
