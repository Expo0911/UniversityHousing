package com.javaweb.po;

public class Room extends IdEntity<Room> {

	private String roomNumber;
	private String placeNumber;
	private float monthRate;
	private int vacancy;
	private int houseId;
	
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public float getMonthRate() {
		return monthRate;
	}
	public void setMonthRate(float monthRate) {
		this.monthRate = monthRate;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getPlaceNumber() {
		return placeNumber;
	}
	public void setPlaceNumber(String placeNumber) {
		this.placeNumber = placeNumber;
	}
	public int getVacancy() {
		return vacancy;
	}
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	
}

