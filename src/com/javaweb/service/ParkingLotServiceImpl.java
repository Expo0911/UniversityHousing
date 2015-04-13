package com.javaweb.service;

import java.util.ArrayList;
import java.util.List;

import com.javaweb.dao.NearbyDAO;
import com.javaweb.dao.ParkingLotDAO;
import com.javaweb.po.ParkingLot;

public class ParkingLotServiceImpl implements ParkingLotService {
	private ParkingLotDAO parkingLotDAO;
	private NearbyDAO nearbyDAO;

	public void setParkingLotDAO(ParkingLotDAO parkingLotDAO) {
		this.parkingLotDAO = parkingLotDAO;
	}
	

	public void setNearbyDAO(NearbyDAO nearbyDAO) {
		this.nearbyDAO = nearbyDAO;
	}


	// add Student
	@Override
	public boolean addParkingLot(ParkingLot parkingLot) {
		if (parkingLotDAO.queryByID(ParkingLot.class,parkingLot.getId()) == null) {
			parkingLotDAO.save(parkingLot);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteParkingLot(int id) {
		if (parkingLotDAO.queryByID(ParkingLot.class,id) != null) {
			parkingLotDAO.delete(ParkingLot.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateParkingLot(ParkingLot parkingLot) {
		if (parkingLotDAO.queryByID(ParkingLot.class,parkingLot.getId()) != null) {
			parkingLotDAO.update(parkingLot);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List<ParkingLot> queryAllParkingLot() {
		return parkingLotDAO.queryAll(ParkingLot.class);
	}

	@Override
	public ParkingLot queryParkingLotByID(int id) {
		return parkingLotDAO.queryByID(ParkingLot.class,id);
	}

	@Override
	public List<ParkingLot> queryNearbyParkingLot(int houseId) {
		// TODO Auto-generated method stub
		List <Integer> parkingList=nearbyDAO.findNearbyParkingbyHouseId(houseId);
		List<ParkingLot> parkingLots= new ArrayList<ParkingLot>();
		if (parkingList.size()==0) {
			return null;
		}
		else {
			for (Integer integer : parkingList) {
				ParkingLot parkingLot=parkingLotDAO.queryByID(ParkingLot.class, integer);
				if (parkingLot!=null) {
					parkingLots.add(parkingLot);
				}
				
			}
			return parkingLots;
		}
	}


	@Override
	public List<ParkingLot> queryGeneralParkingLot() {
		// TODO Auto-generated method stub
		return parkingLotDAO.findBytype("general");
	}


}
