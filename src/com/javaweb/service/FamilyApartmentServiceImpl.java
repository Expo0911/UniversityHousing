package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.FamilyApartmentDAO;
import com.javaweb.po.FamilyApartment;

public class FamilyApartmentServiceImpl implements FamilyApartmentService {
	private FamilyApartmentDAO familyApartmentDAO;

	public FamilyApartmentDAO getFamilyApartmentDAO() {
		return familyApartmentDAO;
	}

	public void setFamilyApartmentDAO(FamilyApartmentDAO familyApartmentDAO) {
		this.familyApartmentDAO = familyApartmentDAO;
	}

	// add Student
	@Override
	public boolean addFamilyApartment(FamilyApartment familyApartment) {
		if (familyApartmentDAO.queryByID(FamilyApartment.class,familyApartment.getId()) == null) {
			familyApartmentDAO.save(familyApartment);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteFamilyApartment(int id) {
		if (familyApartmentDAO.queryByID(FamilyApartment.class,id) != null) {
			familyApartmentDAO.delete(FamilyApartment.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateFamilyApartment(FamilyApartment familyApartment) {
		if (familyApartmentDAO.queryByID(FamilyApartment.class,familyApartment.getId()) != null) {
			familyApartmentDAO.update(familyApartment);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllFamilyApartment() {
		return familyApartmentDAO.queryAll(FamilyApartment.class);
	}

	@Override
	public FamilyApartment queryFamilyApartmentByID(int id) {
		return familyApartmentDAO.queryByID(FamilyApartment.class,id);
	}

	@Override
	public int queryAvailableApartments() {
		// TODO Auto-generated method stub
		List<FamilyApartment> familyApartments=familyApartmentDAO.findAvailableFamilyApt();
		if (familyApartments==null) {
			return -1;
		}
		else {
			for (FamilyApartment familyApartment : familyApartments) {
				return familyApartment.getId();
			}
		}
		return -1;
	}


}
