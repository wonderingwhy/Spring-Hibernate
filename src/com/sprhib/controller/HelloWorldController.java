package com.sprhib.controller;



import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sprhib.model.Users;
import com.sprhib.service.UserManager;
@Controller
@RequestMapping(value="/test2")
public class HelloWorldController{
	@Resource(name="UserManagerImpl")
	private UserManager userManager;
	@RequestMapping(value="/addUser")
	public String addUser(Users user,HttpServletRequest request){
		
		//request.setAttribute("userName", user.getUsername());
		//request.setAttribute("passWord", user.getPassword());
		userManager.addUser(user);
		return "/Welcome";
		/*String result="{\"username\":"+user.getUsername()+",\"password\":"+user.getPassword()+"}";
		
		PrintWriter out=null;
		response.setContentType("application/json");
		try {
			out=response.getWriter();
			out.write(result);
			System.out.println(out);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	@RequestMapping(value="/toUser")
	public String toUser(){
		return "/index";
	}
	/*public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String hello="中文";
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("map1", "中文");
		map.put("map2", "英文");
		map.put("map3", "日文");
		return new ModelAndView("/index","result",map);
	}*/

}
