package com.e2eqa.solidwithjava.hr.personnel;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

	@Override
	public void requestTimeOff(int nbDays, Employee manager) {
		// TODO Auto-generated method stub
		
	}
}
