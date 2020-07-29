package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author jack.lian
 */
public class DemoServiceApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        http().httpPort(8080);
        load(new DemoModule());
        load(new CustomerModule());
    }
}
