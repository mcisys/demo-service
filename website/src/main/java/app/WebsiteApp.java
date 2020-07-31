package app;

import core.framework.module.App;

/**
 * @author jack.lian
 */
public class WebsiteApp extends App {
    @Override
    protected void initialize() {
        http().httpPort(8083);
        load(new WebsiteModule());
    }
}
