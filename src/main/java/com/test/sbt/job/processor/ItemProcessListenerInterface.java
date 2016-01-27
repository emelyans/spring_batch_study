package com.test.sbt.job.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;

/**
 * Created by Sergei on 1/26/2016.
 */
public class ItemProcessListenerInterface implements ItemProcessListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void beforeProcess(Object item) {
        logger.debug("beforeProcess: {}", item);
    }

    public void afterProcess(Object item, Object result) {
        logger.debug("afterProcess item: {}", item);
        logger.debug("afterProcess result: {}", result);
    }

    public void onProcessError(Object item, Exception e) {
        logger.error("onProcessError item: {}", item);
        logger.error("onProcessError exception: {}", e);
    }
}
