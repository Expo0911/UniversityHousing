package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ParkingRequest;

public interface ParkingRequestDAO extends BaseDAO<ParkingRequest> {
	public List<ParkingRequest> findParkingRequestsbyStudentId(int sid);
}
