package com.e2eqa.solidwithjava.hr.main;

import java.io.IOException;
import java.util.List;

import com.e2eqa.solidwithjava.hr.logging.ConsoleLogger;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeFileSerializer;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeRepositoryBad;
import com.e2eqa.solidwithjava.hr.personnel.Employee;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
    	EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
    	ConsoleLogger consoleLogger = new ConsoleLogger();
    	
        EmployeeRepositoryBad repository = new EmployeeRepositoryBad(employeeFileSerializer);
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            try {
				repository.save(e);
				consoleLogger.writeInfo("Saved employee " + e.toString());
			} catch (IOException exception) {
				consoleLogger.writeError("Error saving employee", exception);
			}
        }
    }
}
