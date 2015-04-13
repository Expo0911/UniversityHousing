package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Guest;

public interface GuestService {
	public boolean addGuest(Guest guest);
	
	public boolean deleteGuest(int id);
	
	public boolean updateGuest(Guest guest);
	
	public List queryAllGuest();
	
	public Guest queryGuestByID(int id);
}
