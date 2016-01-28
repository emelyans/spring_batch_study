package com.test.sbt.job.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

/**
 * Created by Sergei on 1/26/2016.
 */
public class ItemWriteListenerInterface implements ItemWriteListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void beforeWrite(List items) {
        logger.debug("beforeWrite: {}", items);
    }

    public void afterWrite(List items) {
        logger.debug("afterWrite: {}", items);
    }

    public void onWriteError(Exception exception, List items) {
        logger.error("onWriteError items: {}", items);
        logger.error("onWriteError exception: {}", exception);
    }
}
