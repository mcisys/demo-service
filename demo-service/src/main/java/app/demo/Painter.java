package app.demo;

import core.framework.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dev
 */
public class Painter {

    private final Logger logger = LoggerFactory.getLogger(Painter.class);

    @Inject
    Brush brush;

    public void draw() {
        logger.warn("drawing picture...");
        brush.print();
    }
}
