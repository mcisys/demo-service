package app;

import app.customer.domain.CustomerStatus;
import org.junit.jupiter.api.Test;

import static core.framework.test.Assertions.assertEnumClass;

/**
 * @author jack.lian
 */
public class CustomerStatusTest {
    @Test
    void hasExactlyConstantsAs() {
        assertEnumClass(CustomerStatus.class).hasExactlyConstantsAs(Enum2.class);
    }

    public enum Enum2 {
        ACTIVE,
        INACTIVE
    }
}
