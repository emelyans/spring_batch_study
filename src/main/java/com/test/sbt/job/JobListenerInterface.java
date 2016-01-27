package com.test.sbt.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * Created by Sergei on 1/24/2016.
 */
public class JobListenerInterface implements JobExecutionListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void beforeJob(JobExecution jobExecution) {
        logger.debug("beforeJob: {}", jobExecution);
    }

    public void afterJob(JobExecution jobExecution) {
        logger.debug("afterJob: {}", jobExecution);

        if( jobExecution.getStatus() == BatchStatus.COMPLETED ){
            //job success
        }
        else if(jobExecution.getStatus() == BatchStatus.FAILED){
            //job failure
        }
    }
}
