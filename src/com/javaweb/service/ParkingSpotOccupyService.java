package com.javaweb.service;

import java.util.List;

import com.javaweb.po.ParkingSpotOccupy;


public interface ParkingSpotOccupyService {
	public boolean addParkingSpotOccupy(ParkingSpotOccupy parkingSpotOccupy);
	
	public boolean deleteParkingSpotOccupy(int id);
	
	public boolean updateParkingSpotOccupy(ParkingSpotOccupy parkingSpotOccupy);
	
	public List queryAllParkingSpotOccupy();
	
	public ParkingSpotOccupy queryParkingSpotOccupyByID(int id);
	
	public int findStudentIdbySpotId(int pid);
	public int findSpotIdbyStudentId(int sid);

	public ParkingSpotOccupy queryOccupyBySpotId(int id);
}
