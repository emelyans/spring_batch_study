package com.test.sbt.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by emelyans on 1/25/2016.
 */
public class JobRun{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String OUTPUT_FILE_NAME = "file:target/output.csv";

    @Autowired
    Job job;

    @Autowired
    JobLauncher jobLauncher;

    private JobExecution jobExecution = null;

    public void setJob(Job job) {
        this.job = job;
    }

    public void setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
    }

    public String run() {
        final JobParameters jobParameters = new JobParametersBuilder() //
                .addString("outputFile", OUTPUT_FILE_NAME)
                .toJobParameters();
        logger.debug("Run SpringBatch job...");
        try {
            jobExecution = jobLauncher.run(job, jobParameters);
        } catch (JobExecutionAlreadyRunningException e) {
            e.printStackTrace();
        } catch (JobRestartException e) {
            e.printStackTrace();
        } catch (JobInstanceAlreadyCompleteException e) {
            e.printStackTrace();
        } catch (JobParametersInvalidException e) {
            e.printStackTrace();
        }

        logger.debug("Status: {}", jobExecution.getStatus());
        logger.debug("Exit Status: {}", jobExecution.getExitStatus().getExitCode());

        return jobExecution.getExitStatus().getExitCode();
    }
}
