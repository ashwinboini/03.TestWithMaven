package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.City;

public class CityRepository extends AbstractSQLDAO
	implements IQuery<City>	{
	
	ArrayList<City> list = new ArrayList<>();
		
	@Override
	public void results(ResultSet rs) throws SQLException {
		
		// TODO Auto-generated method stub
		int id = rs.getInt("ID");
		String name = rs.getString("name");
		int population = rs.getInt("Population");
		list.add( new City(id, name, population));


	}
	
	@Override
	public ArrayList<City> findAll() {
		String sql = "select ID, Name, Population " + "from city";
		super.process(sql);
		return list;
	}

	
	}
