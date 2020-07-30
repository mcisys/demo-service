package app;

import app.demo.Brush;
import app.demo.Painter;
import core.framework.async.Executor;
import core.framework.module.Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

/**
 * @author jack.lian
 */
public class DemoModule extends Module {
    private final Logger logger = LoggerFactory.getLogger(DemoModule.class);

    @Override
    protected void initialize() {
        bind(Brush.class);
        bind(Painter.class);
        Painter painter = bean(Painter.class);
        painter.draw();

        Executor executor = executor().add("jack", 2);
        executor.submit("jack-test", () -> logger.warn("executor running..."), Duration.ofSeconds(1000));
    }
}
