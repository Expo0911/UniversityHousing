package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.HousingInterest;


public class HousingInterestDAOImpl extends BaseDAOImpl<HousingInterest>implements HousingInterestDAO {

	public List findHousingIdbyInterest(String interest){
		return queryByAttribute(HousingInterest.class, "interests", interest);
	}

	@Override
	public List findbyHouseId(int houseId) {
		// TODO Auto-generated method stub
		return queryByForeignId(HousingInterest.class, "houseId", houseId);
	}

}
