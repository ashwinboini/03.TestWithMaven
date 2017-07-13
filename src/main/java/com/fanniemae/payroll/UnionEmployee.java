package com.fanniemae.payroll;

public class UnionEmployee extends Employee {

	float hoursWorked = 40f;

	public UnionEmployee(float yearlySalary) {
		super(yearlySalary);

		this.getYearlySalary();
	}

	public UnionEmployee(float yearlySalary, float hoursWorked) {
		super(yearlySalary);
		this.hoursWorked = hoursWorked;
	}

	//code = new, code == season
	public UnionEmployee(String code, float yearlySalary, float hoursWorked) throws Exception {
		super(yearlySalary);
		this.hoursWorked = hoursWorked;
		
		if (hoursWorked > 40 && code.equals("new"))	{
			Exception e = new Exception();
			throw e;
		}
	}
	
	// Annotations
	@Override
	public float getWeeklySalary() {

		float otHours = 0;
		float otPay = 0;
		float weeklySalary = 0;

		if (hoursWorked > 40) {
			otHours = this.hoursWorked - 40;
			otPay = otHours * this.getOverTimeHourlyWage();

			weeklySalary = 40 * super.getHourlySalary() + otPay;
		}

		else {
			weeklySalary = super.getHourlySalary() * this.hoursWorked;

		}
		return weeklySalary;
	}

	@Override
	public float getOverTimeHourlyWage() {
		float ot = super.getHourlySalary() * 1.5f;
		return ot;
	}

	// Annotations
	@Override
	public String toString() {
		return "I am an employee that makes " + this.getYearlySalary() + " yearly ";
	}
}
