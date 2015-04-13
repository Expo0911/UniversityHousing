package com.javaweb.service;

import java.util.List;

import com.javaweb.po.ParkingSpot;

public interface ParkingSpotService {
	public boolean addParkingSpot(ParkingSpot parkingSpot);
	
	public boolean deleteParkingSpot(int id);
	
	public boolean updateParkingSpot(ParkingSpot parkingSpot);
	
	public List queryAllParkingSpot();
	
	public ParkingSpot queryParkingSpotByID(int id);
	
	public List<ParkingSpot> queryParkingSpotsbyLotId(int lot_id);
	
	public List<ParkingSpot> queryAvlParkingSpotsbyLotId(int lot_id,String prefer);
}
