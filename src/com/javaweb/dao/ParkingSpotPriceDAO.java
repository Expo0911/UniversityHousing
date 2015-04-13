package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ParkingSpotPrice;



public interface ParkingSpotPriceDAO extends BaseDAO<ParkingSpotPrice> {
	public List<ParkingSpotPrice> findPricebySpotClassification(String classification);
}
