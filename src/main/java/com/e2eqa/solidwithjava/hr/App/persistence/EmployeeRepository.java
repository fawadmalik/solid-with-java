package com.e2eqa.solidwithjava.hr.app.persistence;

import java.util.Arrays;
import java.util.List;

import com.e2eqa.solidwithjava.hr.app.personnel.Employee;
import com.e2eqa.solidwithjava.hr.app.personnel.FullTimeEmployee;
import com.e2eqa.solidwithjava.hr.app.personnel.PartTimeEmployee;

/*
Helper method to perform CRUD operations on employees. In a production
application we could use the database for persistence. In this demo,
we are storing employees in the file system.
 */

public class EmployeeRepository {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }
}
