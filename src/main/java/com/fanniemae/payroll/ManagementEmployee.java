package com.fanniemae.payroll;

/* Overtime Pay
 * 
 * >= 10 then 1000
 * >= 20 then 2000
 * >= 40 then 4000
 */

public class ManagementEmployee extends Employee {

	float hoursWorked = 40f;
	
	public ManagementEmployee(float yearlySalary) {
		super(yearlySalary);
		// TODO Auto-generated constructor stub
	}

	public ManagementEmployee(float yearlySalary, float hw){
		super(yearlySalary);
		this.hoursWorked = hw;
	}

	// Annotations
	@Override
	public float getOverTimeHourlyWage() {
				
		float otWage = 0f;
		
		if (hoursWorked >= 50 && hoursWorked < 60) {
			otWage = 1000 / (hoursWorked - 40);
		}
		else if (hoursWorked >= 60 && hoursWorked < 80) {
			otWage = 2000 / (hoursWorked - 40);
			
		}
		else if (hoursWorked >= 80) {
			otWage = 4000 / (hoursWorked - 40);
		}
		return otWage;
	}
	
	// Annotations
	@Override
	public float getWeeklySalary() {

		float otSalary = super.getWeeklySalary();
		
		if (hoursWorked >= 50 && hoursWorked < 60) {
			otSalary = super.getWeeklySalary() + 1000;
		}

		else if
			(hoursWorked >= 60 && hoursWorked < 80) {
				otSalary = super.getWeeklySalary() + 2000;
		}
		
		else if
			(hoursWorked >= 80) {
				otSalary = super.getWeeklySalary() + 4000;
		}
		return otSalary;
		}
	
		// Annotations
		@Override
		public String toString() {
			return "I am an employee that makes " + this.getYearlySalary() + " yearly ";
		}

}

