package com.test.sbt.job.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;

/**
 * Created by Sergei on 1/26/2016.
 */
public class SkipListenerAnnotations {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @OnSkipInRead
    public void onSkipInRead(Throwable t) {
        logger.error("onSkipInRead: {}", t.getMessage());
    }

    @OnSkipInWrite
    public void onSkipInWrite(Object item, Throwable t) {
        logger.error("onSkipInWrite item: {}", item);
        logger.error("onSkipInWrite error: {}", t.getMessage());
    }

    @OnSkipInProcess
    public void onSkipInProcess(Object item, Throwable t) {
        logger.error("onSkipInProcess item: {}", item);
        logger.error("onSkipInProcess error: {}", t.getMessage());
    }
}
