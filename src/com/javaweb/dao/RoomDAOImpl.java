package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Room;

public class RoomDAOImpl extends BaseDAOImpl<Room>implements RoomDAO{

	@Override
	public List findRoombyAptId(int aptId) {
		// TODO Auto-generated method stub
		return this.queryByForeignId(Room.class, "houseId", aptId);
	}

}
