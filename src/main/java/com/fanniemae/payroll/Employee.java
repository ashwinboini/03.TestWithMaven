package com.fanniemae.payroll;

public abstract class Employee {

	protected float yearlySalary = 0;

	public Employee(float yearlySalary) {
	this.yearlySalary = yearlySalary;

	}

	public float getWeeklySalary() {
		return yearlySalary / 52;
	}

	public float getMonthlySalary() {
		return yearlySalary / 12;
	}

		/* Create a method for hourlyWage based on a 40 hour week
		 * method name: getHourlySalary	 */
	
	public float getHourlySalary() {
		return yearlySalary / 52 / 40;
	}
	
	public float getYearlySalary() {
		return yearlySalary;
	}
	
	public float getOverTimeHourlyWage(){
		return 0;
	}
	/*
	 * the objective is to find the monthly salary create method call
	 * getMonthlySalary;
	 */
}
