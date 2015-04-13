package com.javaweb.service;

import java.util.List;

import com.javaweb.po.User;


public interface UserService {
	public boolean addUser(User user);
	
	public boolean deleteUser(int id);
	
	public boolean updateUser(User user);
	
	public List queryAllUser();
	
	public User queryUserByID(int id);
}
