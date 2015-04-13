package com.javaweb.service;

import java.util.List;

import com.javaweb.po.ResidenceHall;

public interface ResidenceHallService {
public boolean addResidenceHall(ResidenceHall residenceHall);
	
	public boolean deleteResidenceHall(int id);
	
	public boolean updateResidenceHall(ResidenceHall residenceHall);
	
	public List queryAllResidenceHall();
	
	public ResidenceHall queryResidenceHallByID(int id);
	
	public int queryAvailableHallbyName(String name);
	
	public int queryAvailableHall();
	
	public int queryGeneralHall();
	
	public int queryGeneralHallbyName(String name);
	
	public int queryAvailableHallbyName(String name,String interest);
	
	public int queryAvailableHall(String interest);
	
	public int queryGeneralHall(String interest);
	
	public int queryGeneralHallbyName(String name,String interest);
	
	
}
