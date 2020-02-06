package com.e2eqa.solidwithjava.hr.app.main;

import java.util.List;

import com.e2eqa.solidwithjava.hr.app.persistence.EmployeeRepository;
import com.e2eqa.solidwithjava.hr.app.personnel.Employee;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            Employee.save(e);
        }
    }
}
