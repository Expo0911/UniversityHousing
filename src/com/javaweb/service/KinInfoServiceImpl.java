package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.KinInfoDAO;
import com.javaweb.po.KinInfo;

public class KinInfoServiceImpl {
	private KinInfoDAO kinInfoDAO;

	public void setKinInfoDAO(KinInfoDAO kinInfoDAO) {
		this.kinInfoDAO = kinInfoDAO;
	}

	// add KinInfo
	public boolean addKinInfo(KinInfo entity) {
		if (kinInfoDAO.queryByID(KinInfo.class,entity.getId()) == null) {
			kinInfoDAO.save(entity);
		} else {
			return false;
		}
		return true;
	}

	public boolean deleteKinInfo(int id) {
		if (kinInfoDAO.queryByID(KinInfo.class,id) != null) {
			kinInfoDAO.delete(KinInfo.class,id);
		} else {
			return false;
		}
		return true;
	}

	public boolean updateKinInfo(KinInfo entity) {
		if (kinInfoDAO.queryByID(KinInfo.class,entity.getId()) != null) {
			kinInfoDAO.update(entity);
		} else {
			return false;
		}
		return true;
	}

	public List queryAllKinInfo() {
		return kinInfoDAO.queryAll(KinInfo.class);
	}
	public KinInfo queryKinInfoByID(int id) {
		return kinInfoDAO.queryByID(KinInfo.class,id);
	}

}
