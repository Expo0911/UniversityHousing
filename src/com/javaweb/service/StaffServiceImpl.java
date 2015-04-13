package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.StaffDAO;
import com.javaweb.po.Staff;

public class StaffServiceImpl implements StaffService {
	private StaffDAO staffDAO;

	public void setStaffDAO(StaffDAO staffDAO) {
		this.staffDAO = staffDAO;
	}

	// add Staff
	@Override
	public boolean addStaff(Staff staff) {
		if (staffDAO.queryByID(Staff.class,staff.getId()) == null) {
			staffDAO.save(staff);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteStaff(int id) {
		if (staffDAO.queryByID(Staff.class,id) != null) {
			staffDAO.delete(Staff.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateStaff(Staff staff) {
		if (staffDAO.queryByID(Staff.class,staff.getId()) != null) {
			staffDAO.update(staff);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllStaff() {
		return staffDAO.queryAll(Staff.class);
	}

	@Override
	public Staff queryStaffByID(int id) {
		return staffDAO.queryByID(Staff.class,id);
	}


}
