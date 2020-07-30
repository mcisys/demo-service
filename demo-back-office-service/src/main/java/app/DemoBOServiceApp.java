package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author jack.lian
 */
public class DemoBOServiceApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        http().httpPort(8081);
        load(new CustomerModule());
        load(new ProductModule());
    }
}
