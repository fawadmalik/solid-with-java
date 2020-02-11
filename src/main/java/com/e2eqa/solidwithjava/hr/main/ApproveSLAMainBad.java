package com.e2eqa.solidwithjava.hr.main;

import com.e2eqa.solidwithjava.hr.logging.ConsoleLogger;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeFileSerializer;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeRepositoryBad;
import com.e2eqa.solidwithjava.hr.personnel.Employee;
import com.e2eqa.solidwithjava.hr.personnel.ServiceLicenseAgreement;
import com.e2eqa.solidwithjava.hr.personnel.SubcontractorBad;

import java.util.List;

public class ApproveSLAMainBad {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepositoryBad repository = new EmployeeRepositoryBad(employeeFileSerializer);

        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);

        // Grab subcontractors
        List<Employee> subcontractors = repository.findAll();

        for (Employee e : subcontractors){
            if(e instanceof  SubcontractorBad){
                SubcontractorBad s = (SubcontractorBad)e;
                s.approveSLA(companySla);
            }
        }
    }
}
