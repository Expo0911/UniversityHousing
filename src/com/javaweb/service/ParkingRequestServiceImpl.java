package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ParkingRequestDAO;
import com.javaweb.po.ParkingRequest;

public class ParkingRequestServiceImpl implements ParkingRequestService {
	private ParkingRequestDAO parkingRequestDAO;

	public void setParkingRequestDAO(ParkingRequestDAO parkingRequestDAO) {
		this.parkingRequestDAO = parkingRequestDAO;
	}

	// add ParkingRequest
	@Override
	public boolean addParkingRequest(ParkingRequest parkingRequest) {
		if (parkingRequestDAO.queryByID(ParkingRequest.class,parkingRequest.getId()) == null) {
			parkingRequestDAO.save(parkingRequest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteParkingRequest(int id) {
		if (parkingRequestDAO.queryByID(ParkingRequest.class,id) != null) {
			parkingRequestDAO.delete(ParkingRequest.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateParkingRequest(ParkingRequest parkingRequest) {
		if (parkingRequestDAO.queryByID(ParkingRequest.class,parkingRequest.getId()) != null) {
			parkingRequestDAO.update(parkingRequest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllParkingRequest() {
		return parkingRequestDAO.queryAll(ParkingRequest.class);
	}

	@Override
	public ParkingRequest queryParkingRequestByID(int id) {
		return parkingRequestDAO.queryByID(ParkingRequest.class,id);
	}

	@Override
	public List<ParkingRequest> queryParkingRequestsbyStudentId(int sid) {
		// TODO Auto-generated method stub
		return parkingRequestDAO.findParkingRequestsbyStudentId(sid);
	}


}
