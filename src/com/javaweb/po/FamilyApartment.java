package com.javaweb.po;

public class FamilyApartment extends IdEntity<FamilyApartment> {
	
	private String name;
	private String addr;
	private String tel;
	private int aptNum;
	private int bedCount;
	private int vacancy;
	private float monthRate;
	private float deposit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAptNum() {
		return aptNum;
	}
	public void setAptNum(int aptNum) {
		this.aptNum = aptNum;
	}
	public int getBedCount() {
		return bedCount;
	}
	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}
	public float getMonthRate() {
		return monthRate;
	}
	public void setMonthRate(float monthRate) {
		this.monthRate = monthRate;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public int getVacancy() {
		return vacancy;
	}
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	
}

