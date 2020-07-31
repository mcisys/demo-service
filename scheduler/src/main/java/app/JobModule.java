package app;

import app.job.DemoJob;
import core.framework.module.Module;

import java.time.Duration;

/**
 * @author kimi
 */
public class JobModule extends Module {
    @Override
    protected void initialize() {

        schedule().fixedRate("reservationRemindJob", bind(DemoJob.class), Duration.ofMinutes(1));
    }
}
