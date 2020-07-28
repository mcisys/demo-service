package app;

import app.demo.Brush;
import app.demo.Painter;
import core.framework.module.Module;

/**
 * @author dev
 */
public class DemoModule extends Module {
    @Override
    protected void initialize() {
        bind(Brush.class);
        bind(Painter.class);
        Painter painter = bean(Painter.class);
        painter.draw();
    }
}
