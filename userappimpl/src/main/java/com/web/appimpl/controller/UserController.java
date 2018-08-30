package com.web.appimpl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.web.appimpl.beans.UserRegistration;
import com.web.appimpl.entity.UserRegistrationModel;
import com.web.appimpl.service.UserLoginService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	RestTemplate restTemplate; 
	
	
	@PostMapping("registerUsr")
	public @ResponseBody String registerUser(@RequestBody UserRegistration userRegistration)
	{
		String returnResult = null;
		UserRegistrationModel userRegistrationModel =null;
		 
		boolean checkResult = userLoginService.searchDuplicateUserDurinRegistration(userRegistration.getU_id(),userRegistration.getU_ph());
		if(checkResult==true)
			returnResult = "fail";
		else
			 userRegistrationModel = new UserRegistrationModel(userRegistration.getU_id(), userRegistration.getU_fname(), userRegistration.getU_mname(), 
					                                           userRegistration.getU_lname(), userRegistration.getU_ph(), userRegistration.getU_email(), 
					                                           userRegistration.getU_address()//,userRegistration.getU_id()
					                                           );
		
			userLoginService.saveNewUser(userRegistrationModel);
			returnResult="success";
		
		return returnResult;
	}

}
