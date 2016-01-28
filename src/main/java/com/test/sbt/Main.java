package com.test.sbt;

import com.test.sbt.job.JobRun;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by emelyans on 1/25/2016.
 */
class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringConfiguration.xml");

        JobRun jobRun = (JobRun) context.getBean("jobRun");
        String exitCode = jobRun.run();

        if("FAILED".equals(exitCode))
            System.exit(1);
        else
            System.exit(0);
    }
}
