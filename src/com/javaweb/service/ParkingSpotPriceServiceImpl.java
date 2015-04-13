package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ParkingSpotPriceDAO;
import com.javaweb.po.ParkingSpotPrice;


public class ParkingSpotPriceServiceImpl  implements ParkingSpotPriceService{
	private ParkingSpotPriceDAO parkingSpotPriceDAO;
	
	public void setParkingSpotPriceDAO(ParkingSpotPriceDAO parkingSpotPriceDAO) {
		this.parkingSpotPriceDAO = parkingSpotPriceDAO;
	}

	// add Student
	@Override
	public boolean addParkingSpotPrice(ParkingSpotPrice parkingSpotPrice) {
		if (parkingSpotPriceDAO.queryByID(ParkingSpotPrice.class,parkingSpotPrice.getId()) == null) {
			parkingSpotPriceDAO.save(parkingSpotPrice);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteParkingSpotPrice(int id) {
		if (parkingSpotPriceDAO.queryByID(ParkingSpotPrice.class,id) != null) {
			parkingSpotPriceDAO.delete(ParkingSpotPrice.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateParkingSpotPrice(ParkingSpotPrice parkingSpotPrice) {
		if (parkingSpotPriceDAO.queryByID(ParkingSpotPrice.class,parkingSpotPrice.getId()) != null) {
			parkingSpotPriceDAO.update(parkingSpotPrice);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllParkingSpotPrice() {
		return parkingSpotPriceDAO.queryAll(ParkingSpotPrice.class);
	}

	@Override
	public ParkingSpotPrice queryParkingSpotPriceByID(int id) {
		return parkingSpotPriceDAO.queryByID(ParkingSpotPrice.class,id);
	}
	
	
	@Override
	public float findPricebySpotClassification(String classification)
	{
		String [] reqStrings=classification.split(" ");
		List<ParkingSpotPrice> parkingSpotPrices=parkingSpotPriceDAO.findPricebySpotClassification(reqStrings[0]);
		if (parkingSpotPrices.size()==0) {
			return 0;
		}
		else {
			for (ParkingSpotPrice parkingSpotPrice : parkingSpotPrices) {
				return parkingSpotPrice.getPrice();
			}
		}
		return 0;
	}
}
