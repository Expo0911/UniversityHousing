package com.javaweb.service;

import java.util.ArrayList;
import java.util.List;

import com.javaweb.dao.GeneralApartmentDAO;
import com.javaweb.po.GeneralApartment;
import com.javaweb.po.HousingInterest;

public class GeneralApartmentServiceImpl implements GeneralApartmentService {
	private GeneralApartmentDAO generalApartmentDAO;
	private HousingInterestService housingInterestService;
	private RoomService roomService;
	public void setGeneralApartmentDAO(GeneralApartmentDAO generalApartmentDAO) {
		this.generalApartmentDAO = generalApartmentDAO;
	}

	public void setHousingInterestService(
			HousingInterestService housingInterestService) {
		this.housingInterestService = housingInterestService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	// add Student
	@Override
	public boolean addGeneralApartment(GeneralApartment generalApartment) {
		if (generalApartmentDAO.queryByID(GeneralApartment.class,generalApartment.getId()) == null) {
			generalApartmentDAO.save(generalApartment);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteGeneralApartment(int id) {
		if (generalApartmentDAO.queryByID(GeneralApartment.class,id) != null) {
			generalApartmentDAO.delete(GeneralApartment.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateGeneralApartment(GeneralApartment generalApartment) {
		if (generalApartmentDAO.queryByID(GeneralApartment.class,generalApartment.getId()) != null) {
			generalApartmentDAO.update(generalApartment);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllGeneralApartment() {
		return generalApartmentDAO.queryAll(GeneralApartment.class);
	}

	@Override
	public GeneralApartment queryGeneralApartmentByID(int id) {
		return generalApartmentDAO.queryByID(GeneralApartment.class,id);
	}

	@Override
	public int queryAvailableApartments() {
		// TODO Auto-generated method stub
		List<GeneralApartment> apartments=this.queryAllGeneralApartment();
		if (apartments.size()==0) {
			return -1;
		}
		else {
			for (GeneralApartment generalApartment : apartments) {
				if (generalApartment.getRoomCount()>roomService.queryRoomsInHouse(generalApartment.getId())) {
					return generalApartment.getId();
				}
			}
			return -1;
		}
	}

	@Override
	public int queryAvailableApartmentsByInterest(String interest) {
		// TODO Auto-generated method stub
		List<Integer> houseIds=housingInterestService.findHousingIdbyInterest(interest);
		if (houseIds==null) {
			return this.queryAvailableApartments();
		}
		else {
			List<GeneralApartment> apartments=this.queryAllGeneralApartment();
			if (apartments==null) {
				return -1;
			}
			else {
				int init_id=-1;
				for (GeneralApartment generalApartment : apartments) {
					int aptId=generalApartment.getId();
					if (generalApartment.getRoomCount()>roomService.queryRoomsInHouse(aptId)) {
						if (houseIds.contains(aptId)) {
							return aptId;
						}
						init_id=aptId;
					}
				}
				return init_id;
			}
		}
	}


}
