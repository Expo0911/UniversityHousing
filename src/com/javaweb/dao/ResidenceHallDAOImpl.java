package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ResidenceHall;

public class ResidenceHallDAOImpl extends BaseDAOImpl<ResidenceHall> implements ResidenceHallDAO{

	@Override
	public List<ResidenceHall> findHallsbyName(String name) {
		// TODO Auto-generated method stub
		return this.queryByAttribute(ResidenceHall.class, "name", name);
	}

}
