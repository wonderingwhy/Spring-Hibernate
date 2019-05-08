package com.sprhib.dao;

import com.sprhib.model.Users;


public interface UserDao {
	public void addUser(Users user);
	
	public Users getUser(String username);

}
