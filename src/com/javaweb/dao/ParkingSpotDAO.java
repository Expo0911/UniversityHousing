package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ParkingSpot;

public interface ParkingSpotDAO extends BaseDAO<ParkingSpot>{
	public List<ParkingSpot> findParkingSpotsbyLotId(int lot_id);
	public List<ParkingSpot> findAvlParkingSpotsbyLotId(int lot_id, String prefer);
}
