package com.web.appimpl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.appimpl.beans.UserRegistration;
import com.web.appimpl.common.QueryGenerator;
import com.web.appimpl.dao.UserLoginDao;
import com.web.appimpl.entity.UserRegistrationModel;
import com.web.appimpl.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	
	
	@Autowired
	UserLoginDao userLoginDao;
	
	@Transactional
	public List<UserRegistrationModel> viewAllUserLoginList()
	{
		return userLoginDao.findAll();
	}
	
	@Transactional
	public void saveNewUser(UserRegistrationModel userRegistrationModel)
	{
		userLoginDao.saveAndFlush(userRegistrationModel);
	}
	
	@Transactional
	public boolean searchDuplicateUserDurinRegistration(String id,long ph)
	{
		int countChk1 = userLoginDao.findAllByph_forDuplicateUsers(ph);
		int countChk2 = userLoginDao.findAllById_forDuplicateUsers(id);
		
		if(countChk1 == 0 || countChk2 == 0)
			return false;
		else
			return true;
	}
}
