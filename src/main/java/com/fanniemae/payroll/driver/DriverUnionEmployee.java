package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.UnionEmployee;

public class DriverUnionEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			UnionEmployee ue = new UnionEmployee("new", 50_000, 42);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
