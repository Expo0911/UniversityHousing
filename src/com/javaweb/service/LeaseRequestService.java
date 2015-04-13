package com.javaweb.service;

import java.util.List;

import com.javaweb.po.LeaseRequest;

public interface LeaseRequestService {
	public boolean addLeaseRequest(LeaseRequest leaseRequest);
	
	public boolean deleteLeaseRequest(int id);
	
	public boolean updateLeaseRequest(LeaseRequest leaseRequest);
	
	public List queryAllLeaseRequest();
	
	public LeaseRequest queryLeaseRequestByID(int id);

	public List queryLeaseRequestByStudentId(int user_id);
	

}
