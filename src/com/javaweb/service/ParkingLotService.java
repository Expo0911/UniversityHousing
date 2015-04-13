package com.javaweb.service;

import java.util.List;

import com.javaweb.po.ParkingLot;

public interface ParkingLotService {
	public boolean addParkingLot(ParkingLot parkingLot);
	
	public boolean deleteParkingLot(int id);
	
	public boolean updateParkingLot(ParkingLot parkingLot);
	
	public List<ParkingLot> queryAllParkingLot();
	
	public ParkingLot queryParkingLotByID(int id);
	
	public List<ParkingLot> queryNearbyParkingLot(int houseId);
	
	public List<ParkingLot> queryGeneralParkingLot();
}
