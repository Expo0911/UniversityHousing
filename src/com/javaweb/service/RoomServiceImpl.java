package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.RoomDAO;
import com.javaweb.po.Room;

public class RoomServiceImpl implements RoomService {
	private RoomDAO roomDAO;

	public void setRoomDAO(RoomDAO roomDAO) {
		this.roomDAO = roomDAO;
	}

	// add Room
	@Override
	public boolean addRoom(Room room) {
		if (roomDAO.queryByID(Room.class,room.getId()) == null) {
			roomDAO.save(room);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteRoom(int id) {
		if (roomDAO.queryByID(Room.class,id) != null) {
			roomDAO.delete(Room.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateRoom(Room room) {
		if (roomDAO.queryByID(Room.class,room.getId()) != null) {
			roomDAO.update(room);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllRoom() {
		return roomDAO.queryAll(Room.class);
	}

	@Override
	public Room queryRoomByID(int id) {
		return roomDAO.queryByID(Room.class,id);
	}

	@Override
	public int queryRoomsInHouse(int aptId) {
		// TODO Auto-generated method stub
		int count=0;
		List<Room> rooms= roomDAO.findRoombyAptId(aptId);
		if (rooms==null) {
			return count;
		}
		else {
			for (Room room : rooms) {
				if (room.getVacancy()==1) {
					count++;
				}
			}
			return count;
		}
		
	}

	@Override
	public Room queryRoomInHouse(int houseId) {
		// TODO Auto-generated method stub
		List<Room> rooms= roomDAO.findRoombyAptId(houseId);
		if (rooms==null) {
			return null;
		}
		else {
			for (Room room : rooms) {
				if (room.getVacancy()==0) {
					return room;
				}
			}
		}
		return null;
	}


}
