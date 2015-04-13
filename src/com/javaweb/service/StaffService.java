package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Staff;

public interface StaffService {
	public boolean addStaff(Staff staff);
	
	public boolean deleteStaff(int id);
	
	public boolean updateStaff(Staff staff);
	
	public List queryAllStaff();
	
	public Staff queryStaffByID(int id);
}
