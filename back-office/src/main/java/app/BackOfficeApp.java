package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author jack.lian
 */
public class BackOfficeApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        loadProperties("app.properties");
        http().httpPort(8082);
        load(new WebModule());
        load(new ProductModule());
    }
}
