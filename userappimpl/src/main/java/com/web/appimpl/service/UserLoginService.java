package com.web.appimpl.service;

import java.util.List;


import com.web.appimpl.entity.UserRegistrationModel;

public interface UserLoginService {
	
	public List<UserRegistrationModel> viewAllUserLoginList();
	public void saveNewUser(UserRegistrationModel userRegistrationModel);
	public boolean searchDuplicateUserDurinRegistration(String id,long ph);

}
