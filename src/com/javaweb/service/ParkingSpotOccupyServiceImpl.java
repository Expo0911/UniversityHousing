package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ParkingSpotOccupyDAO;
import com.javaweb.po.ParkingSpotOccupy;

public class ParkingSpotOccupyServiceImpl implements ParkingSpotOccupyService {
	private ParkingSpotOccupyDAO parkingSpotOccupyDAO;
	public void setParkingSpotOccupyDAO(ParkingSpotOccupyDAO parkingSpotOccupyDAO) {
		this.parkingSpotOccupyDAO = parkingSpotOccupyDAO;
	}

	// add Student
	@Override
	public boolean addParkingSpotOccupy(ParkingSpotOccupy parkingSpotOccupy) {
		if (parkingSpotOccupyDAO.queryByID(ParkingSpotOccupy.class,parkingSpotOccupy.getId()) == null) {
			parkingSpotOccupyDAO.save(parkingSpotOccupy);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteParkingSpotOccupy(int id) {
		if (parkingSpotOccupyDAO.queryByID(ParkingSpotOccupy.class,id) != null) {
			parkingSpotOccupyDAO.delete(ParkingSpotOccupy.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateParkingSpotOccupy(ParkingSpotOccupy parkingSpotOccupy) {
		if (parkingSpotOccupyDAO.queryByID(ParkingSpotOccupy.class,parkingSpotOccupy.getId()) != null) {
			parkingSpotOccupyDAO.update(parkingSpotOccupy);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllParkingSpotOccupy() {
		return parkingSpotOccupyDAO.queryAll(ParkingSpotOccupy.class);
	}

	@Override
	public ParkingSpotOccupy queryParkingSpotOccupyByID(int id) {
		return parkingSpotOccupyDAO.queryByID(ParkingSpotOccupy.class,id);
	}
	
	
	@Override
	public int findStudentIdbySpotId(int pid)
	{
		return parkingSpotOccupyDAO.findStudentIdbySpotId(pid);
	}

	@Override
	public int findSpotIdbyStudentId(int sid)
	{
		return parkingSpotOccupyDAO.findSpotIdbyStudentId(sid);
	}

	@Override
	public ParkingSpotOccupy queryOccupyBySpotId(int id) {
		// TODO Auto-generated method stub
		List<ParkingSpotOccupy> occupies=parkingSpotOccupyDAO.findParkingSpotOccupybySpotId(id);
		if (occupies.size()>0) {
			return occupies.get(0);
		}
		else return null;
	}


}
