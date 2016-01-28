package com.test.sbt.job.tasklet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * Created by Sergei on 1/27/2016.
 */
public class TaskletTest implements Tasklet, InitializingBean {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private String message;

    private Integer callTimes;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCallTimes(int callTimes) {
        this.callTimes = callTimes;
    }

    public void afterPropertiesSet() throws Exception {
        Assert.state(!StringUtils.isEmpty(message), "Message must be set.");
        Assert.state(callTimes != null && callTimes > 0 && callTimes <= 10,
                "Call times must be between a number from 1 to 10.");
    }

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        logger.info("{} Countdown: {}", message, callTimes);
        callTimes--;
        return RepeatStatus.continueIf(callTimes > 0);
    }
}
