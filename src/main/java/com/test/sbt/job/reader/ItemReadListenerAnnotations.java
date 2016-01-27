package com.test.sbt.job.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.*;
import org.springframework.batch.core.scope.context.ChunkContext;

/**
 * Created by Sergei on 1/26/2016.
 */
public class ItemReadListenerAnnotations {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeRead
     public void beforeRead() {
        logger.debug("beforeRead");
    }

    @AfterRead
    public void afterRead(Object item) {
        logger.debug("afterRead: {}", item);
    }

    @OnReadError
    public void onReadError(Exception ex) {
        logger.error("onReadError: {}", ex.getMessage());
    }
}
