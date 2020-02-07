package com.e2eqa.solidwithjava.hr.app.main;

import java.io.IOException;
import java.util.List;

import com.e2eqa.solidwithjava.hr.app.logging.ConsoleLogger;
import com.e2eqa.solidwithjava.hr.app.persistence.EmployeeFileSerializer;
import com.e2eqa.solidwithjava.hr.app.persistence.EmployeeRepository;
import com.e2eqa.solidwithjava.hr.app.personnel.Employee;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
    	EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
    	ConsoleLogger consoleLogger = new ConsoleLogger();
    	
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);
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
