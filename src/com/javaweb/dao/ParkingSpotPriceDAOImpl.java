package com.javaweb.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.javaweb.po.ParkingSpotPrice;



public class ParkingSpotPriceDAOImpl extends BaseDAOImpl<ParkingSpotPrice> implements ParkingSpotPriceDAO{
	
	public List<ParkingSpotPrice> findPricebySpotClassification(String str){
		return this.queryByAttribute(ParkingSpotPrice.class, "classification", str);
	}
	

}
