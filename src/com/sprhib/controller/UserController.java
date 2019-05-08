package com.sprhib.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sprhib.model.Users;
import com.sprhib.service.UserManager;

@Controller
@RequestMapping("/test1")
public class UserController {
	@Resource(name="UserManagerImpl")
	private UserManager userManager;
	@RequestMapping("/addUser")
	public String addUser(Users user){
		userManager.addUser(user);
		return "/success";
	}
	@RequestMapping("/getUser")
	public String Login(Users user,HttpServletRequest request){
		Users u=userManager.getUser(user.getUsername());
		if(u!=null)
			return "/Welcome";
		return "/index";
	}
	@RequestMapping(value="/toUser")
	public String toUser(){
		return "/index";
	}
}
