package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.LeaseRequest;

public class LeaseRequestDAOImpl extends BaseDAOImpl<LeaseRequest>implements LeaseRequestDAO {

	@Override
	public List findRequestbyStudentId(int sid) {
		// TODO Auto-generated method stub
		return queryByForeignId(LeaseRequest.class, "studentId", sid);
	}
}
