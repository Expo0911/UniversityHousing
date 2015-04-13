package com.javaweb.po;

public class ParkingSpotPrice extends IdEntity<ParkingSpotPrice> {
	private String classification;
	private float price;
	
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
