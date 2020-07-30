package app.web;

import core.framework.module.App;

/**
 * @author jack.lian
 */
public class DemoSiteApp extends App {
    @Override
    protected void initialize() {
        load(new DemoWebModule());
    }
}
