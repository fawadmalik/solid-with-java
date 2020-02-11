package com.e2eqa.solidwithjava.hr.main;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import com.e2eqa.solidwithjava.hr.logging.ConsoleLogger;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeFileSerializer;
import com.e2eqa.solidwithjava.hr.persistence.EmployeeRepository;
import com.e2eqa.solidwithjava.hr.personnel.Employee;
import com.e2eqa.solidwithjava.hr.taxes.TaxCalculator;
import com.e2eqa.solidwithjava.hr.taxes.TaxCalculatorFactory;

public class CalculateEmployeeTaxesMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        double totalTaxes = 0;
        for (Employee employee: employees){
            TaxCalculator taxCalculator = TaxCalculatorFactory.create(employee);

            // compute individual tax
            double tax = taxCalculator.calculate(employee);
            String formattedTax = currencyFormatter.format(tax);
            consoleLogger.writeInfo(employee.getFullName() + " taxes: " + formattedTax);

            // add to company total taxes
            totalTaxes += taxCalculator.calculate(employee);
        }
        consoleLogger.writeInfo("Total taxes = " + currencyFormatter.format(totalTaxes));
    }
}
