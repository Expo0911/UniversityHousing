package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ParkingLot;

public interface ParkingLotDAO extends BaseDAO<ParkingLot>{
	public List<ParkingLot>  findBytype(String str);
}
