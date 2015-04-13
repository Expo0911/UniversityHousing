package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.FamilyApartment;

public class FamilyApartmentDAOImpl extends BaseDAOImpl<FamilyApartment>implements FamilyApartmentDAO {

	@Override
	public List findAvailableFamilyApt() {
		// TODO Auto-generated method stub
		return queryByAttribute(FamilyApartment.class, "vacancy", "0");
	}

	

}
