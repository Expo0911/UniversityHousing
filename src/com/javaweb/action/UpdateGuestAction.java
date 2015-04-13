package com.javaweb.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Guest;
import com.javaweb.service.GuestService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateGuestAction extends ActionSupport{
	private int id;
	private String password;
	private String fname;
	private String lname;
	private String type;  // Single/Family
	private String gender;
	private String tel;
	private String alterTel;
	private String addr;
	private String city;
	private String postCode;
	private Date birthDate;
	private String category; // First year/Graduate
	private String nation;
	private String smoker;
	private String need; // special need
	private String comment;
	private String status;
	private String courses;
	private int kinId;
	
	private GuestService guestService;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getAlterTel() {
		return alterTel;
	}



	public void setAlterTel(String alterTel) {
		this.alterTel = alterTel;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPostCode() {
		return postCode;
	}



	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getNation() {
		return nation;
	}



	public void setNation(String nation) {
		this.nation = nation;
	}



	public String getSmoker() {
		return smoker;
	}



	public void setSmoker(String smoker) {
		this.smoker = smoker;
	}



	public String getNeed() {
		return need;
	}



	public void setNeed(String need) {
		this.need = need;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getCourses() {
		return courses;
	}



	public void setCourses(String courses) {
		this.courses = courses;
	}



	public int getKinId() {
		return kinId;
	}



	public void setKinId(int kinId) {
		this.kinId = kinId;
	}



	public GuestService getGuestService() {
		return guestService;
	}



	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}



	@Override
	public String execute() throws Exception {
		Guest guest = new Guest();
		guest.setId(id);
		guest.setPassword(password);
		guest.setFname(fname);
		guest.setLname(lname);
		guest.setTel(tel);
		guest.setType(type);
		guest.setGender(gender);
		guest.setAlterTel(alterTel);
		guest.setAddr(addr);
		guest.setCity(city);
		guest.setPostCode(postCode);
		guest.setBirthDate(birthDate);
		guest.setCategory(category);
		guest.setNation(nation);
		guest.setSmoker(smoker);
		guest.setNeed(need);
		guest.setComment(comment);
		guest.setStatus(status);
		guest.setCourses(courses);
		guest.setKinId(kinId);
		if(guestService.updateGuest(guest)){
			ServletActionContext.getRequest().setAttribute("Guest", guest);
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	
}