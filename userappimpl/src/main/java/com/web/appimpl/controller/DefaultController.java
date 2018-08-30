package com.web.appimpl.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.web.appimpl.beans.UserDetails;
import com.web.appimpl.beans.UserLogin;
import com.web.appimpl.entity.UserRegistrationModel;
import com.web.appimpl.service.UserLoginService;

@RestController
public class DefaultController {
	
	/*@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	RestTemplate restTemplate; 
	
	@PostMapping("/default")
	@ResponseBody
	public String defaultMethod(@RequestBody UserDetails userDetails, HttpServletRequest request,HttpServletResponse response)
	{
		//TransactionDetailsBean tdb = new TransactionDetailsBean(new Date(),"/default");
		

		System.out.println(userDetails.getId());
		System.out.println(userDetails.getFname());
		System.out.println("inside default controller");
		return "default controller";
	}
	
	//## using jpa
	@GetMapping("/ulist")
	public List<UserRegistrationModel> fetchAllUserList()
	{
		return userLoginService.viewAllUserLoginList();
	}
	
	
	@GetMapping("/test")
	@ResponseBody
	public UserLogin testJson(HttpServletRequest request,HttpServletResponse response)
	{
		UserLogin userLogin = new UserLogin();
				  userLogin.setUid("1");
				  userLogin.setUname("abc");
				  

		//System.out.println(userLogin.getUid());
		//System.out.println("inside default controller");
		return userLogin;
	}
*/
}
