package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Nearby;

public interface NearbyService {
	public boolean addNearby(Nearby entity);
	
	public boolean deleteNearby(int id);
	
	public boolean updateNearby(Nearby entity);
	
	public List queryAllNearby();
	
	public Nearby queryNearbyByID(int id);
}
