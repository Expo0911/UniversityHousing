package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.LeaseRequest;

public interface LeaseRequestDAO extends BaseDAO<LeaseRequest>{
	public List findRequestbyStudentId(int sid);
}
