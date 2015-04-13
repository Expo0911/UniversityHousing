package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ParkingLot;

public class ParkingLotDAOImpl extends BaseDAOImpl<ParkingLot>implements ParkingLotDAO {

	@Override
	public List<ParkingLot> findBytype(String str) {
		// TODO Auto-generated method stub
		return queryByAttribute(ParkingLot.class, "type", "general");
	}

	

}
