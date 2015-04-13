package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.UserDAO;
import com.javaweb.po.User;


public class UserServiceImpl implements UserService{
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	// add User
	@Override
	public boolean addUser(User user) {
		if (userDAO.queryByID(User.class,user.getId()) == null) {
			userDAO.save(user);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		if (userDAO.queryByID(User.class,id) != null) {
			userDAO.delete(User.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		if (userDAO.queryByID(User.class,user.getId()) != null) {
			userDAO.update(user);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllUser() {
		return userDAO.queryAll(User.class);
	}

	@Override
	public User queryUserByID(int id) {
		return userDAO.queryByID(User.class,id);
	}


}
