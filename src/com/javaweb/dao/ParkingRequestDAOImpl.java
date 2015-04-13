package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.ParkingRequest;

public class ParkingRequestDAOImpl extends BaseDAOImpl<ParkingRequest>implements ParkingRequestDAO {

	@Override
	public List<ParkingRequest> findParkingRequestsbyStudentId(int sid) {
		// TODO Auto-generated method stub
		return queryByForeignId(ParkingRequest.class, "studentId", sid);
	}

	

}
