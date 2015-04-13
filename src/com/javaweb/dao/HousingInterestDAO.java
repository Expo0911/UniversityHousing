package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.HousingInterest;



public interface HousingInterestDAO extends BaseDAO<HousingInterest> {
	public List findHousingIdbyInterest(String interest);
	
	public List findbyHouseId(int houseId);
}
