package com.javaweb.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Staff;
import com.javaweb.service.StaffService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateStaffAction extends ActionSupport{
	private int id;
	private String password;
	private String fname;
	private String lname;
	private String addr;
	private String city;
	private String postCode;
	private Date birthDate;
	private String gender;
	private String position;
	private String workAt;
	
	private StaffService staffService;


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getWorkAt() {
		return workAt;
	}


	public void setWorkAt(String workAt) {
		this.workAt = workAt;
	}


	public void setstaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	
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




	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
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


	@Override
	public String execute() throws Exception {
		Staff staff = new Staff();
		staff.setId(id);
		staff.setPassword(password);
		staff.setFname(fname);
		staff.setLname(lname);

		staff.setGender(gender);
	
		staff.setAddr(addr);
		staff.setCity(city);
		staff.setPostCode(postCode);
		staff.setBirthDate(birthDate);
		staff.setPosition(position);
		staff.setWorkAt(workAt);
		
		if(staffService.updateStaff(staff)){
			ServletActionContext.getRequest().setAttribute("staff", staff);
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	
}