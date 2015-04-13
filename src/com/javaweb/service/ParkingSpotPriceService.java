package com.javaweb.service;

import java.util.List;

import com.javaweb.po.ParkingSpotPrice;


public interface ParkingSpotPriceService {
	public boolean addParkingSpotPrice(ParkingSpotPrice parkingSpotPrice);
	
	public boolean deleteParkingSpotPrice(int id);
	
	public boolean updateParkingSpotPrice(ParkingSpotPrice parkingSpotPrice);
	
	public List queryAllParkingSpotPrice();
	
	public ParkingSpotPrice queryParkingSpotPriceByID(int id);
	
	public float findPricebySpotClassification(String classification);

}
