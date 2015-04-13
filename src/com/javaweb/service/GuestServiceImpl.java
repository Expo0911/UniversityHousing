package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.GuestDAO;
import com.javaweb.po.Guest;

public class GuestServiceImpl implements GuestService {
	private GuestDAO guestDAO;

	public void setGuestDAO(GuestDAO guestDAO) {
		this.guestDAO = guestDAO;
	}

	// add Guest
	@Override
	public boolean addGuest(Guest guest) {
		if (guestDAO.queryByID(Guest.class,guest.getId()) == null) {
			guestDAO.save(guest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteGuest(int id) {
		if (guestDAO.queryByID(Guest.class,id) != null) {
			guestDAO.delete(Guest.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateGuest(Guest guest) {
		if (guestDAO.queryByID(Guest.class,guest.getId()) != null) {
			guestDAO.update(guest);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllGuest() {
		return guestDAO.queryAll(Guest.class);
	}

	@Override
	public Guest queryGuestByID(int id) {
		return guestDAO.queryByID(Guest.class,id);
	}


}
