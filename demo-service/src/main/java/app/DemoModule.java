package app;

import app.demo.Brush;
import app.demo.Painter;
import core.framework.async.Executor;
import core.framework.module.Module;

import java.time.Duration;

/**
 * @author jack.lian
 */
public class DemoModule extends Module {
    @Override
    protected void initialize() {
        bind(Brush.class);
        bind(Painter.class);
        Painter painter = bean(Painter.class);
        painter.draw();

        Executor executor = executor().add("jack", 2);
        executor.submit("jack-test", () -> System.out.println("executor running..."), Duration.ofSeconds(1000));
    }
}
