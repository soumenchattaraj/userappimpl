package com.web.appimpl.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web.appimpl.entity.UserRegistrationModel;

@Repository
public interface UserLoginDao extends JpaRepository<UserRegistrationModel, Integer>
{
	
	//## all queries are to be written in HQL(Hibernate Query Language).
	
	@Query("select count(u_id) from UserRegistrationModel where u_ph =:ph")
	int findAllByph_forDuplicateUsers(@Param("ph")long ph);
	
	@Query("select count(*) from UserRegistrationModel where u_id =:id")
	int findAllById_forDuplicateUsers(@Param("id")String id);
	

}
