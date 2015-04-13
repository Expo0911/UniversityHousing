package com.javaweb.dao;

import java.util.List;


import com.javaweb.po.ParkingSpotOccupy;



public class ParkingSpotOccupyDAOImpl extends BaseDAOImpl<ParkingSpotOccupy> implements ParkingSpotOccupyDAO{
	
	@Override
	public int findStudentIdbySpotId(int pid){
		List<ParkingSpotOccupy> parkingSpotOccupy=this.queryByForeignId(ParkingSpotOccupy.class, "parkingSpotId", pid);
		
		if(parkingSpotOccupy!=null){
			for (ParkingSpotOccupy element : parkingSpotOccupy) // or sArray
	        {
	               return element.getStudentId();   	
	        }
		}
		
		return -1;
		
	
	}
	
	@Override
	public int findSpotIdbyStudentId(int sid){
		List<ParkingSpotOccupy> parkingSpotOccupy=this.queryByForeignId(ParkingSpotOccupy.class, "studentId", sid);
		
		if(parkingSpotOccupy!=null){
			for (ParkingSpotOccupy element : parkingSpotOccupy) // or sArray
	        {
	               return element.getParkingSpotId();   	
	        }
		}
		return -1;
		
	}

	@Override
	public List<ParkingSpotOccupy> findParkingSpotOccupybySpotId(int pid) {
		// TODO Auto-generated method stub
		return this.queryByForeignId(ParkingSpotOccupy.class, "parkingSpotId", pid);
	}
}
