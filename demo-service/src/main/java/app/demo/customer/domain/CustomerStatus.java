package app.demo.customer.domain;

import core.framework.db.DBEnumValue;

/**
 * @author jack.lian
 */
public enum CustomerStatus {
    @DBEnumValue("ACTIVE")
    ACTIVE,
    @DBEnumValue("INACTIVE")
    INACTIVE
}
