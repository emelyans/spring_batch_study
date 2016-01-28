package com.test.sbt.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

/**
 * Created by Sergei on 1/28/2016.
 */
public class DeciderTest implements JobExecutionDecider {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private FlowExecutionStatus flowExecutionStatus;

    public void setFlowExecutionStatus(FlowExecutionStatus flowExecutionStatus) {
        this.flowExecutionStatus = flowExecutionStatus;
    }

    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
        logger.debug("FlowExecutionStatus: {}", flowExecutionStatus);
        return flowExecutionStatus;
    }
}
