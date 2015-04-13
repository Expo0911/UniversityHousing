package com.javaweb.dao;

import java.util.ArrayList;
import java.util.List;

import com.javaweb.po.Lease;


public class LeaseDAOImpl extends BaseDAOImpl<Lease>implements LeaseDAO {

	@Override
	public List<Lease> findLeasebyStudentId(int sid) {
		// TODO Auto-generated method stub
		return this.queryByForeignId(Lease.class, "studentId", sid);
	}
	// save

	
	@Override
	public int findCurrentIdbyStudentId(int sid){
		
		List<Lease> leases=this.queryByForeignId(Lease.class, "studentId", sid);
		if(leases!=null){
			for (Lease element : leases) // or sArray
	        {
	               if(element.getStatus().equals("current"))
	               	return element.getId();    	
	        }
		}
		
		return -1;
	}
	
	@Override
	public List<Lease> findCLeasesbyStudentId(int sid){
		List<Lease> leases=this.queryByForeignId(Lease.class, "studentId", sid);
		List<Lease> cLeases=new ArrayList<Lease>();
		if(leases!=null){
			for (Lease element : leases) // or sArray
	        {
	               if(element.getStatus().equals("current"))
	               	cLeases.add(element);    	
	        }
		}
		
		return cLeases;
	};
	
	@Override
	public List<Lease> findFLeasesbyStudentId(int sid){
		List<Lease> leases=this.queryByForeignId(Lease.class, "studentId", sid);
		List<Lease> fLeases=new ArrayList<Lease>();
		
		if(leases!=null){
			for (Lease element : leases) // or sArray
	        {
	               if(element.getStatus().equals("former"))
	               	fLeases.add(element);    	
	        }
		}
		return fLeases;
	}
		

}
