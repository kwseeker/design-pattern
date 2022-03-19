package top.kwseeker.facade.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SampleApp.class);
        logger.info("Hello World");
    }
}
