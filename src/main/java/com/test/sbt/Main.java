package com.test.sbt;

import com.sun.javafx.runtime.SystemProperties;
import com.test.sbt.job.JobRun;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.Launcher;

/**
 * Created by emelyans on 1/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringConfiguration.xml");

        JobRun jobRun = (JobRun) context.getBean("jobRun");
        jobRun.run();
    }
}
