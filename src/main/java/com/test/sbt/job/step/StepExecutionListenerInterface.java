package com.test.sbt.job.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * Created by Sergei on 1/26/2016.
 */
public class StepExecutionListenerInterface implements StepExecutionListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void beforeStep(StepExecution stepExecution) {
        logger.debug("");
        logger.debug("********** STEP: {} **********", stepExecution.getStepName());
        logger.debug("beforeStep: {}", stepExecution);
    }

    public ExitStatus afterStep(StepExecution stepExecution) {
        logger.debug("afterStep: {}", stepExecution);
        logger.debug("********** STEP: {} **********", stepExecution.getStepName());
        logger.debug("");
        // Modified ExitStatus can be returned
        return stepExecution.getExitStatus();
    }
}
