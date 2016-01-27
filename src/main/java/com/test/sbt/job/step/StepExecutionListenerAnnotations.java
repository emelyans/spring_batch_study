package com.test.sbt.job.step;

import com.test.sbt.job.JobRun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;

/**
 * Created by Sergei on 1/26/2016.
 */
public class StepExecutionListenerAnnotations {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeStep
    public void beforeStep(StepExecution stepExecution) {
        logger.debug("beforeStep: {}", stepExecution);
    }

    @AfterStep
    public ExitStatus afterStep(StepExecution stepExecution) {
        logger.debug("afterStep: {}", stepExecution);
        return null;
    }
}
