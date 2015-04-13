package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Nearby;

public interface NearbyDAO extends BaseDAO<Nearby> {
	List<Integer> findNearbyParkingbyHouseId(int house_id);
}
