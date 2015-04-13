package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.FamilyApartment;

public interface FamilyApartmentDAO extends BaseDAO<FamilyApartment>{

	public List findAvailableFamilyApt();
}
