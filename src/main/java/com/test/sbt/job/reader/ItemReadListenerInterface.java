package com.test.sbt.job.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

/**
 * Created by Sergei on 1/26/2016.
 */
public class ItemReadListenerInterface implements ItemReadListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void beforeRead() {
        logger.debug("beforeRead");
    }

    public void afterRead(Object item) {
        logger.debug("afterRead: {}", item);
    }

    public void onReadError(Exception ex) {
        logger.error("onReadError: {}", ex.getMessage());
    }
}
