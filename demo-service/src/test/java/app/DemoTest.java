package app;

import app.demo.Painter;
import core.framework.inject.Inject;
import org.junit.jupiter.api.Test;

/**
 * @author dev
 */
public class DemoTest extends IntegrationTest {

    @Inject
    Painter painter;

    @Test
    public void test() {
        painter.draw();
    }
}
