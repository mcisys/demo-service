package app.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jack.lian
 */
public class Brush {
    private final Logger logger = LoggerFactory.getLogger(Brush.class);

    public void print() {
        logger.warn("Hello World");
    }
}
