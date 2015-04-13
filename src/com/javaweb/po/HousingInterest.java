package com.javaweb.po;

public class HousingInterest extends IdEntity<HousingInterest> {

	private int houseId;
	private String interests;
	
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	
}

