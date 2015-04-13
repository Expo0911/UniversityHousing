package com.javaweb.service;

import java.util.List;

import com.javaweb.po.GeneralApartment;

public interface GeneralApartmentService {
	public boolean addGeneralApartment(GeneralApartment generalapartment);
	
	public boolean deleteGeneralApartment(int id);
	
	public boolean updateGeneralApartment(GeneralApartment generalapartment);
	
	public List queryAllGeneralApartment();
	
	public GeneralApartment queryGeneralApartmentByID(int id);
	
	public int queryAvailableApartments();

	int queryAvailableApartmentsByInterest(String interest);
}
