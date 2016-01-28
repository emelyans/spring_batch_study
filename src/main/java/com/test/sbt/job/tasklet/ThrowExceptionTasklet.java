package com.test.sbt.job.tasklet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created by Sergei on 1/28/2016.
 */
public class ThrowExceptionTasklet implements Tasklet {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private boolean throwException;

    public void setThrowException(boolean throwException) {
        this.throwException = throwException;
    }

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        if (throwException) {
            logger.debug("About to throw an exception.");
            throw new RuntimeException("Exception thrown from step.");
        }

        logger.debug("Exception was not thrown.");

        return RepeatStatus.FINISHED;
    }
}
