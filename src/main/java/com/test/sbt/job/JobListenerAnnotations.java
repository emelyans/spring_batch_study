package com.test.sbt.job;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

/**
 * Created by Sergei on 1/24/2016.
 */
public class JobListenerAnnotations {
    @BeforeJob
    public void beforeJob(JobExecution jobExecution) {

    }

    @AfterJob
    public void afterJob(JobExecution jobExecution) {
        if( jobExecution.getStatus() == BatchStatus.COMPLETED ){
            //job success
        }
        else if(jobExecution.getStatus() == BatchStatus.FAILED){
            //job failure
        }
    }
}
