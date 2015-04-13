package com.javaweb.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.javaweb.po.ParkingSpot;

public class ParkingSpotDAOImpl extends BaseDAOImpl<ParkingSpot>implements ParkingSpotDAO {

	@Override
	public List<ParkingSpot> findParkingSpotsbyLotId(int lot_id) {
		// TODO Auto-generated method stub
		return queryByForeignId(ParkingSpot.class, "lotId", lot_id);
	}

	@Override
	public List<ParkingSpot> findAvlParkingSpotsbyLotId(int lot_id,String prefer) {
		// TODO Auto-generated method stub
		Criterion fidEqualCriterion=Restrictions.eq("lotId", lot_id);
		Criterion availablityCriterion=Restrictions.eq("availability", 0);
		Criterion classficationCriterion=Restrictions.like("classification", "%"+prefer+"%").ignoreCase();
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ParkingSpot.class);
		detachedCriteria.add(fidEqualCriterion);
		detachedCriteria.add(availablityCriterion);
		detachedCriteria.add(classficationCriterion);
		return this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	

}
