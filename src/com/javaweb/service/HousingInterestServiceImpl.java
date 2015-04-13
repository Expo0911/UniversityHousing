package com.javaweb.service;

import java.util.ArrayList;
import java.util.List;

import com.javaweb.dao.HousingInterestDAO;
import com.javaweb.po.HousingInterest;

public class HousingInterestServiceImpl implements HousingInterestService {
	private HousingInterestDAO housingInterestDAO;

	public void setHousingInterestDAO(HousingInterestDAO housingInterestDAO) {
		this.housingInterestDAO = housingInterestDAO;
	}

	// add Student
	@Override
	public boolean addHousingInterest(HousingInterest housingInterest) {
		if (housingInterestDAO.queryByID(HousingInterest.class,housingInterest.getId()) == null) {
			housingInterestDAO.save(housingInterest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteHousingInterest(int id) {
		if (housingInterestDAO.queryByID(HousingInterest.class,id) != null) {
			housingInterestDAO.delete(HousingInterest.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateHousingInterest(HousingInterest housingInterest) {
		if (housingInterestDAO.queryByID(HousingInterest.class,housingInterest.getId()) != null) {
			housingInterestDAO.update(housingInterest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllHousingInterest() {
		return housingInterestDAO.queryAll(HousingInterest.class);
	}

	@Override
	public HousingInterest queryHousingInterestByID(int id) {
		return housingInterestDAO.queryByID(HousingInterest.class,id);
	}

	
	@Override
	public List findHousingIdbyInterest(String interest)
	{
		List<Integer> houseIds=new ArrayList<Integer>();
		List<HousingInterest> housingInterests=housingInterestDAO.findHousingIdbyInterest(interest);
		if (housingInterests.size()==0) {
			return null;
		}
		else {
			for (HousingInterest housingInterest : housingInterests) {
				houseIds.add(housingInterest.getHouseId());
			}
			
		}
		return houseIds;
	}

	@Override
	public boolean checkHouse(int houseId) {
		// TODO Auto-generated method stub
		List<HousingInterest> houseList=housingInterestDAO.findbyHouseId(houseId);
		if (houseList.size()==0) {
			return false;
		}
		else return true;
	}
}

