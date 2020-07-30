package app;

import core.framework.module.App;

/**
 * @author jack.lian
 */
public class DemoSiteApp extends App {
    @Override
    protected void initialize() {
        http().httpPort(8082);
        load(new DemoWebModule());
    }
}
