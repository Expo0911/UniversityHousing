package com.javaweb.dao;

import java.util.ArrayList;
import java.util.List;

import com.javaweb.po.Nearby;

public class NearbyDAOImpl extends BaseDAOImpl<Nearby> implements NearbyDAO {

	@Override
	public List<Integer> findNearbyParkingbyHouseId(int house_id) {
		// TODO Auto-generated method stub
		List <Integer> parkingList=new ArrayList<Integer>();
		List<Nearby> nearbyList=queryByForeignId(Nearby.class, "houseId", house_id);
		if (nearbyList!=null) {
			for (Nearby nearby : nearbyList) {
				parkingList.add(nearby.getHouseId());
			}
			return parkingList;
		}
		else return null;
		
	}

}
