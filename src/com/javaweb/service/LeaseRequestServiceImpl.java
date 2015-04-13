package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.LeaseRequestDAO;
import com.javaweb.po.LeaseRequest;

public class LeaseRequestServiceImpl implements LeaseRequestService {
	private LeaseRequestDAO leaseRequestDAO;

	public void setLeaseRequestDAO(LeaseRequestDAO leaseRequestDAO) {
		this.leaseRequestDAO = leaseRequestDAO;
	}

	// add Student
	@Override
	public boolean addLeaseRequest(LeaseRequest leaseRequest) {
		if (leaseRequestDAO.queryByID(LeaseRequest.class,leaseRequest.getId()) == null) {
			leaseRequestDAO.save(leaseRequest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteLeaseRequest(int id) {
		if (leaseRequestDAO.queryByID(LeaseRequest.class,id) != null) {
			leaseRequestDAO.delete(LeaseRequest.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateLeaseRequest(LeaseRequest leaseRequest) {
		if (leaseRequestDAO.queryByID(LeaseRequest.class,leaseRequest.getId()) != null) {
			leaseRequestDAO.update(leaseRequest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllLeaseRequest() {
		return leaseRequestDAO.queryAll(LeaseRequest.class);
	}

	@Override
	public LeaseRequest queryLeaseRequestByID(int id) {
		return leaseRequestDAO.queryByID(LeaseRequest.class,id);
	}

	@Override
	public List queryLeaseRequestByStudentId(int user_id) {
		// TODO Auto-generated method stub
		return leaseRequestDAO.findRequestbyStudentId(user_id);
	}




}
