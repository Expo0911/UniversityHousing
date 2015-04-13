package com.javaweb.dao;
import java.util.List;

import com.javaweb.po.Room;


public interface RoomDAO extends BaseDAO<Room>{
	
	public List findRoombyAptId(int aptId);
}
