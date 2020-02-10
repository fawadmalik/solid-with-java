package com.e2eqa.solidwithjava.hr.personnel;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

	@Override
	public void requestTimeOff(int nbDays, Employee manager) {
		// TODO Auto-generated method stub
		
	}
}
