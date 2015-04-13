package com.javaweb.service;

import java.util.List;

import com.javaweb.po.HousingInterest;

public interface HousingInterestService {
	public boolean addHousingInterest(HousingInterest housingInterest);
	
	public boolean deleteHousingInterest(int id);
	
	public boolean updateHousingInterest(HousingInterest ousingInterest);
	
	public List queryAllHousingInterest();
	
	
	public HousingInterest queryHousingInterestByID(int id);
	
	public List findHousingIdbyInterest(String interest);
	
	public boolean checkHouse(int houseId);
}
