package com.test.sbt.job.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.SkipListener;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * Created by Sergei on 1/26/2016.
 */
public class SkipListenerInterface implements SkipListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void onSkipInRead(Throwable t) {
        logger.error("onSkipInRead: {}", t.getMessage());
    }

    public void onSkipInWrite(Object item, Throwable t) {
        logger.error("onSkipInWrite item: {}", item);
        logger.error("onSkipInWrite error: {}", t.getMessage());
    }

    public void onSkipInProcess(Object item, Throwable t) {
        logger.error("onSkipInProcess item: {}", item);
        logger.error("onSkipInProcess error: {}", t.getMessage());
    }
}
