package com.test.sbt.job.processor;

import com.test.sbt.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Employee, Employee> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    public Employee process(final Employee employee) throws Exception {
        final String firstName = employee.getFirstName().toUpperCase();
        final String lastName = employee.getLastName().toUpperCase();

        final Employee transformedEmployee = new Employee(firstName, lastName, employee.getSalary());

        log.info("Converting (" + employee + ") into (" + transformedEmployee + ")");

        return transformedEmployee;
    }

}
