package com.fanniemae.payroll.dao;

import java.util.ArrayList;

public class ShoppingRepository implements IQuery<String> {

	@Override
	public ArrayList<String> findAll() {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("oranges,10");
		list.add("apples,5");
		list.add("bread,6");
		list.add("water,2");
		list.add("chips,2");
		
		return list;
	}

}
