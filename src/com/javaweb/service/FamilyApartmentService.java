package com.javaweb.service;

import java.util.List;

import com.javaweb.po.FamilyApartment;

public interface FamilyApartmentService {
	public boolean addFamilyApartment(FamilyApartment familyApartment);
	
	public boolean deleteFamilyApartment(int id);
	
	public boolean updateFamilyApartment(FamilyApartment familyApartment);
	
	public List queryAllFamilyApartment();
	
	public FamilyApartment queryFamilyApartmentByID(int id);
	
	public int queryAvailableApartments();
}
