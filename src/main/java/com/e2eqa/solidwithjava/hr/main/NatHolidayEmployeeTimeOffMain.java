package com.e2eqa.solidwithjava.hr.main;

import com.e2eqa.solidwithjava.hr.logging.ConsoleLogger;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeFileSerializer;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeRepository;
import com.e2eqa.solidwithjava.hr.personnel.Employee;
import com.e2eqa.solidwithjava.hr.personnel.FullTimeEmployee;

import java.util.List;

public class NatHolidayEmployeeTimeOffMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();
        Employee manager = new FullTimeEmployee("Steve Jackson", 5000);

        // Request time off for each employee on
        // national holiday
        for (Employee employee : employees){
            employee.requestTimeOff(1, manager);
        }
    }
}
