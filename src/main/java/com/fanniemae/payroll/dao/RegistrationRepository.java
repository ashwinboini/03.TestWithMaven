package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fanniemae.payroll.model.Registration;

public class RegistrationRepository extends AbstractSQLDAO
	implements IModify<Registration, Integer>	{
		
	@Override
	public void insert(Registration t) {

	      String sql = "INSERT INTO Registration " +
                  "VALUES (_ID, '_FNAME', '_LNAME', _AGE)";	
	      
	      sql = sql.replace("_ID",  t.getId() + "");
	      sql = sql.replace("_FNAME",  t.getFirstName() + "");
	      sql = sql.replace("_LNAME",  t.getLastName() + "");
	      sql = sql.replace("_AGE",  t.getAge() + "");
	      
	      super.modify(sql);
	}
	
	@Override
	public void results(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer key) {

		String sql = "delete from Registration where id = " + key;
		super.modify(sql);
	}


}
