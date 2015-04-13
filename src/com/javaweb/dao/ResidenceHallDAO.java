package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ResidenceHall;

public interface ResidenceHallDAO extends BaseDAO<ResidenceHall> {
	public List<ResidenceHall> findHallsbyName(String name);
	
}
