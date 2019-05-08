package com.sprhib.service;

import com.sprhib.model.Users;



public interface UserManager {
	public void addUser(Users user);
	public Users getUser(String username);
}
