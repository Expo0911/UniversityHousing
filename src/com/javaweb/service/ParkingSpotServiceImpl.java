package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ParkingSpotDAO;
import com.javaweb.po.ParkingSpot;

public class ParkingSpotServiceImpl implements ParkingSpotService {
	private ParkingSpotDAO parkingSpotDAO;

	public void setParkingSpotDAO(ParkingSpotDAO parkingSpotDAO) {
		this.parkingSpotDAO = parkingSpotDAO;
	}

	// add Student
	@Override
	public boolean addParkingSpot(ParkingSpot parkingSpot) {
		if (parkingSpotDAO.queryByID(ParkingSpot.class,parkingSpot.getId()) == null) {
			parkingSpotDAO.save(parkingSpot);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteParkingSpot(int id) {
		if (parkingSpotDAO.queryByID(ParkingSpot.class,id) != null) {
			parkingSpotDAO.delete(ParkingSpot.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateParkingSpot(ParkingSpot parkingSpot) {
		if (parkingSpotDAO.queryByID(ParkingSpot.class,parkingSpot.getId()) != null) {
			parkingSpotDAO.update(parkingSpot);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllParkingSpot() {
		return parkingSpotDAO.queryAll(ParkingSpot.class);
	}

	@Override
	public ParkingSpot queryParkingSpotByID(int id) {
		return parkingSpotDAO.queryByID(ParkingSpot.class,id);
	}

	@Override
	public List<ParkingSpot> queryParkingSpotsbyLotId(int lot_id) {
		// TODO Auto-generated method stub
		return parkingSpotDAO.findParkingSpotsbyLotId(lot_id);
	}

	@Override
	public List<ParkingSpot> queryAvlParkingSpotsbyLotId(int lot_id,String prefer) {
		// TODO Auto-generated method stub
		
		return parkingSpotDAO.findAvlParkingSpotsbyLotId(lot_id, prefer.toLowerCase());
	}


}
