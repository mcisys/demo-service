package app.web;

import app.demo.bo.api.BOCustomerWebService;
import core.framework.module.Module;

/**
 * @author jack.lian
 */
public class DemoWebModule extends Module {
    @Override
    protected void initialize() {
        api().client(BOCustomerWebService.class, "http://localhost:8081");
    }
}
