package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.fanniemae.payroll.model.Country;

public class CountryRepository extends AbstractSQLDAO
	implements IQuery<Country>	{
	
	ArrayList<Country> list = new ArrayList<>();
		
	@Override
	public void results(ResultSet rs) throws SQLException {
		
		// TODO Auto-generated method stub
		String code = rs.getString("Code");
		String name = rs.getString("Name");
		int population = rs.getInt("Population");
		list.add( new Country(code, name, population));


	}
	
	@Override
	public ArrayList<Country> findAll() {
		String sql = "select Code, Name, Population " + "from Country";
		super.process(sql);
		return list;
	}

	
	}
