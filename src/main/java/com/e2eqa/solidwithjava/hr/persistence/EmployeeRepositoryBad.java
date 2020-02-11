package com.e2eqa.solidwithjava.hr.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.e2eqa.solidwithjava.hr.personnel.Employee;
import com.e2eqa.solidwithjava.hr.personnel.FullTimeEmployee;
import com.e2eqa.solidwithjava.hr.personnel.Intern;
import com.e2eqa.solidwithjava.hr.personnel.PartTimeEmployee;
import com.e2eqa.solidwithjava.hr.personnel.SubcontractorBad;

/*
Helper method to perform CRUD operations on employees. In a production
application we could use the database for persistence. In this demo,
we are storing employees in the file system.
 */

public class EmployeeRepositoryBad {
    private EmployeeFileSerializer serializer;

    public EmployeeRepositoryBad(EmployeeFileSerializer serializer) {
        this.serializer = serializer;
    }

    public List<Employee> findAll() {

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        Employee john = new Intern("John Lee", 300, 10);
        Employee catherine = new Intern("Catherine Allison", 500, 15);

        // Subcontractors
        Employee subcontractor = new SubcontractorBad("Rebekah Jackson", 3000);

        return Arrays.asList(anna, billy, steve, magda, john, subcontractor, catherine);
    }

    public void save(Employee employee) throws IOException {
        String serializedString = this.serializer.serialize(employee);

        Path path = Paths.get(employee.getFullName()
                .replace(" ", "_") + ".rec");
        Files.write(path, serializedString.getBytes());
    }
}
