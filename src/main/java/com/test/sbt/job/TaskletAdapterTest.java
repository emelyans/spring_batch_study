package com.test.sbt.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Sergei on 1/27/2016.
 */
public class TaskletAdapterTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void test(String message) {
        logger.info("Message: {}", message);
    }
}
