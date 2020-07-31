package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author jack.lian
 */
public class SchedulerApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        load(new JobModule());
    }
}
