package com.sprhib.service;


import com.sprhib.dao.UserDao;
import com.sprhib.model.Users;

public class UserManagerImpl implements UserManager{


	//@Resource(name="UsersDaoImpl")
	private UserDao userdao;
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public void addUser(Users user) {
		userdao.addUser(user);
	}

	public Users getUser(String username) {
		
		return userdao.getUser(username);
	}

}
