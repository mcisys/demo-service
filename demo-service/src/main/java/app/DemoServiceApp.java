package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author dev
 */
public class DemoServiceApp extends App {
    @Override
    protected void initialize() {
        http().httpsPort(8443);

        load(new SystemModule("sys.properties"));
        http().httpPort(8080);

        load(new DemoModule());
    }
}
