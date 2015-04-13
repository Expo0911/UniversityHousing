package com.javaweb.po;

public class ParkingRequest extends IdEntity<ParkingRequest>{
	private int studentId;
	
	private String classification;
	private String status;
	private int nearby;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNearby() {
		return nearby;
	}
	public void setNearby(int nearby) {
		this.nearby = nearby;
	}

}
