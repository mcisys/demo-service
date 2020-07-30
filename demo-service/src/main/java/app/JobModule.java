package app;

import app.demo.job.DemoJob;
import core.framework.module.Module;

import java.time.Duration;

/**
 * @author jack.lian
 */
public class JobModule extends Module {
    @Override
    protected void initialize() {
        schedule().fixedRate("job-test", bind(DemoJob.class), Duration.ofSeconds(10));
    }
}
