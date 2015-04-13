package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Room;

public interface RoomService {
	public boolean addRoom(Room room);
	
	public boolean deleteRoom(int id);
	
	public boolean updateRoom(Room room);
	
	public List queryAllRoom();
	
	public Room queryRoomByID(int id);
	
	public int queryRoomsInHouse(int aptId);
	
	public Room queryRoomInHouse(int houseId);
}
