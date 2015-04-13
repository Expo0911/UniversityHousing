package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Lease;


public interface LeaseDAO extends BaseDAO<Lease>{
	public List<Lease> findLeasebyStudentId(int sid);
	public List<Lease> findCLeasesbyStudentId(int sid);
	public List<Lease> findFLeasesbyStudentId(int sid);
	public int findCurrentIdbyStudentId(int sid);
}
