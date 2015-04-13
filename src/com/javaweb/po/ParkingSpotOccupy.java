package com.javaweb.po;

public class ParkingSpotOccupy extends IdEntity<ParkingSpotOccupy> {
	int parkingSpotId;
	int studentId;
	public int getParkingSpotId() {
		return parkingSpotId;
	}
	public void setParkingSpotId(int parkingSpotId) {
		this.parkingSpotId = parkingSpotId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	

}
