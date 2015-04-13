package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.NearbyDAO;
import com.javaweb.po.Nearby;

public class NearbyServiceImpl implements NearbyService{
	private NearbyDAO nearbyDAO;

	public void setNearbyDAO(NearbyDAO nearbyDAO) {
		this.nearbyDAO = nearbyDAO;
	}

	// add Nearby
	@Override
	public boolean addNearby(Nearby entity) {
		if (nearbyDAO.queryByID(Nearby.class,entity.getId()) == null) {
			nearbyDAO.save(entity);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteNearby(int id) {
		if (nearbyDAO.queryByID(Nearby.class,id) != null) {
			nearbyDAO.delete(Nearby.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateNearby(Nearby entity) {
		if (nearbyDAO.queryByID(Nearby.class,entity.getId()) != null) {
			nearbyDAO.update(entity);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllNearby() {
		return nearbyDAO.queryAll(Nearby.class);
	}
	@Override
	public Nearby queryNearbyByID(int id) {
		return nearbyDAO.queryByID(Nearby.class,id);
	}

}
