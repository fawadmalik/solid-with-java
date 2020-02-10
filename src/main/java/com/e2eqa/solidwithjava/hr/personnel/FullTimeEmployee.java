package com.e2eqa.solidwithjava.hr.personnel;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

	@Override
	public void requestTimeOff(int nbDays, Employee manager) {
		// TODO Auto-generated method stub
		
	}
}
