package com.javaweb.service;

import java.util.List;

import com.javaweb.po.ParkingRequest;

public interface ParkingRequestService {
	public boolean addParkingRequest(ParkingRequest parkingRequest);
	
	public boolean deleteParkingRequest(int id);
	
	public boolean updateParkingRequest(ParkingRequest parkingRequest);
	
	public List queryAllParkingRequest();
	
	public ParkingRequest queryParkingRequestByID(int id);
	
	public List<ParkingRequest> queryParkingRequestsbyStudentId(int sid);
}
