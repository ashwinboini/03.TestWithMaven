package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.dao.RegistrationRepository;
import com.fanniemae.payroll.model.Registration;

public class DriverRegistrationRepository {

	public static void main(String[] args) {

		RegistrationRepository r = new RegistrationRepository();
		Registration t = new Registration(1000, "ashwin", "boini", 25);
	//	r.insert(t);
		
		r.delete((1000));
	}

}
