package com.test.sbt.job.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.AfterProcess;
import org.springframework.batch.core.annotation.BeforeProcess;
import org.springframework.batch.core.annotation.OnProcessError;

/**
 * Created by Sergei on 1/26/2016.
 */
public class ItemProcessListenerAnnotations {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeProcess
    public void beforeProcess(Object item) {
        logger.debug("beforeProcess: {}", item);
    }

    @AfterProcess
    public void afterProcess(Object item, Object result) {
        logger.debug("afterProcess item: {}", item);
        logger.debug("afterProcess result: {}", result);
    }

    @OnProcessError
    public void onProcessError(Object item, Exception e) {
        logger.error("onProcessError item: {}", item);
        logger.error("onProcessError exception: {}", e);
    }
}
