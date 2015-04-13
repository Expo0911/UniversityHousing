package com.javaweb.service;

import java.util.List;

import com.javaweb.po.KinInfo;

public interface KinInfoService {
	public boolean addKinInfo(KinInfo entity);
	
	public boolean deleteKinInfo(int id);
	
	public boolean updateKinInfo(KinInfo entity);
	
	public List queryAllKinInfo();
	
	public KinInfo queryKinInfoByID(int id);
}
