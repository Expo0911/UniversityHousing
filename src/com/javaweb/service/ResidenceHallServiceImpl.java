package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ResidenceHallDAO;
import com.javaweb.po.GeneralApartment;
import com.javaweb.po.ResidenceHall;

public class ResidenceHallServiceImpl implements ResidenceHallService{
	private ResidenceHallDAO residenceHallDAO;
	private RoomService roomService;
	private HousingInterestService housingInterestService;
	public void setResidenceHallDAO(ResidenceHallDAO residenceHallDAO) {
		this.residenceHallDAO = residenceHallDAO;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public void setHousingInterestService(
			HousingInterestService housingInterestService) {
		this.housingInterestService = housingInterestService;
	}

	// add ResidenceHall
	@Override
	public boolean addResidenceHall(ResidenceHall entity) {
		if (residenceHallDAO.queryByID(ResidenceHall.class,entity.getId()) == null) {
			residenceHallDAO.save(entity);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteResidenceHall(int id) {
		if (residenceHallDAO.queryByID(ResidenceHall.class,id) != null) {
			residenceHallDAO.delete(ResidenceHall.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateResidenceHall(ResidenceHall entity) {
		if (residenceHallDAO.queryByID(ResidenceHall.class,entity.getId()) != null) {
			residenceHallDAO.update(entity);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllResidenceHall() {
		return residenceHallDAO.queryAll(ResidenceHall.class);
	}

	@Override
	public ResidenceHall queryResidenceHallByID(int id) {
		return residenceHallDAO.queryByID(ResidenceHall.class,id);
	}

	@Override
	public int queryAvailableHallbyName(String name) {
		// TODO Auto-generated method stub
		List<ResidenceHall> halls=residenceHallDAO.findHallsbyName(name);
		if (halls==null) {
			return -1;
		}
		else {
			for (ResidenceHall residenceHall : halls) {
				if (residenceHall.getRoomCount()>roomService.queryRoomsInHouse(residenceHall.getId())) {
					return residenceHall.getId();
				}
			}
			return -1;
		}
	}

	@Override
	public int queryAvailableHall() {
		// TODO Auto-generated method stub
		List<ResidenceHall> halls=this.queryAllResidenceHall();
		if (halls==null) {
			return -1;
		}
		else {
			for (ResidenceHall residenceHall : halls) {
				if (residenceHall.getRoomCount()>roomService.queryRoomsInHouse(residenceHall.getId())) {
					return residenceHall.getId();
				}
			}
			return -1;
		}
	}

	@Override
	public int queryGeneralHallbyName(String name) {
		// TODO Auto-generated method stub
		List<ResidenceHall> halls=residenceHallDAO.findHallsbyName(name);
		if (halls==null) {
			return -1;
		}
		else {
			for (ResidenceHall residenceHall : halls) {
				if (residenceHall.getSpecific()==0 && residenceHall.getRoomCount()>roomService.queryRoomsInHouse(residenceHall.getId())) {
					return residenceHall.getId();
				}
			}
			return -1;
		}
	}

	@Override
	public int queryGeneralHall() {
		// TODO Auto-generated method stub
		List<ResidenceHall> halls=residenceHallDAO.queryAll(ResidenceHall.class);
		if (halls==null) {
			return -1;
		}
		else {
			for (ResidenceHall residenceHall : halls) {
				if (residenceHall.getSpecific()==0 && residenceHall.getRoomCount()>roomService.queryRoomsInHouse(residenceHall.getId())) {
					return residenceHall.getId();
				}
			}
			return -1;
		}
	}

	@Override
	public int queryAvailableHallbyName(String name, String interest) {
		// TODO Auto-generated method stub
		List<Integer> houseIds=housingInterestService.findHousingIdbyInterest(interest);
		if (houseIds==null) {
			return this.queryGeneralHall();
		}
		else {
			List<ResidenceHall> halls=residenceHallDAO.findHallsbyName(name);
			if (halls==null) {
				return -1;
			}
			else {
				int init_id=-1;
				for (ResidenceHall residenceHall : halls) {
					int hallId=residenceHall.getId();
					if (residenceHall.getRoomCount()>roomService.queryRoomsInHouse(hallId)) {
						if (houseIds.contains(hallId)) {
							return hallId;
						}
						init_id=hallId;
					}
				}
				return init_id;
			}
		}
	}

	@Override
	public int queryAvailableHall(String interest) {
		// TODO Auto-generated method stub
		List<Integer> houseIds=housingInterestService.findHousingIdbyInterest(interest);
		if (houseIds==null) {
			return this.queryGeneralHall();
		}
		else {
			List<ResidenceHall> halls=this.queryAllResidenceHall();
			if (halls==null) {
				return -1;
			}
			else {
				int init_id=-1;
				for (ResidenceHall residenceHall : halls) {
					int hallId=residenceHall.getId();
					if (residenceHall.getRoomCount()>roomService.queryRoomsInHouse(hallId)) {
						if (houseIds.contains(hallId)) {
							return hallId;
						}
						init_id=hallId;
					}
				}
				return init_id;
			}
		}
	}

	@Override
	public int queryGeneralHall(String interest) {
		// TODO Auto-generated method stub
		List<Integer> houseIds=housingInterestService.findHousingIdbyInterest(interest);
		if (houseIds==null) {
			return this.queryGeneralHall();
		}
		else {
			List<ResidenceHall> halls=this.queryAllResidenceHall();
			if (halls==null) {
				return -1;
			}
			else {
				int init_id=-1;
				for (ResidenceHall residenceHall : halls) {
					int hallId=residenceHall.getId();
					if (residenceHall.getSpecific()==0 && residenceHall.getRoomCount()>roomService.queryRoomsInHouse(hallId)) {
						if (houseIds.contains(hallId)) {
							return hallId;
						}
						init_id=hallId;
					}
				}
				return init_id;
			}
		}
	}

	@Override
	public int queryGeneralHallbyName(String name, String interest) {
		// TODO Auto-generated method stub
		List<Integer> houseIds=housingInterestService.findHousingIdbyInterest(interest);
		if (houseIds==null) {
			return this.queryGeneralHall();
		}
		else {
			List<ResidenceHall> halls=residenceHallDAO.findHallsbyName(name);
			if (halls==null) {
				return -1;
			}
			else {
				int init_id=-1;
				for (ResidenceHall residenceHall : halls) {
					int hallId=residenceHall.getId();
					if (residenceHall.getSpecific()==0 && residenceHall.getRoomCount()>roomService.queryRoomsInHouse(hallId)) {
						if (houseIds.contains(hallId)) {
							return hallId;
						}
						init_id=hallId;
					}
				}
				return init_id;
			}
		}
	}

}
