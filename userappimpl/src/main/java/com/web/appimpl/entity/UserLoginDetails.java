package com.web.appimpl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_login",schema="user_authentication")
public class UserLoginDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="u_login_pk")
	private int loginPk;
	
	/*@Column(name="u_registartion_fk",nullable=false)
	private int uRegistartionFk;*/
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="u_pk")
	UserRegistrationModel userRegistrationModel;
	
	
	@Column(name="u_login_id",nullable=false,unique=true)
	private String uLoginId;
	
	@Column(name="u_password",nullable=false)
	private String uPassword;
	
	@Column(name="u_active_status",nullable=false,columnDefinition= "boolean default false")
	private boolean uActiveStatus;
	
	@Column(name="u_squestion_status",nullable=false,length=1,columnDefinition= "character varying DEFAULT 'NA'::character varying")
	private String uSecurityQuestionStatus;

	public UserLoginDetails() {
		super();
	}

	public int getLoginPk() {
		return loginPk;
	}

	public void setLoginPk(int loginPk) {
		this.loginPk = loginPk;
	}

	public String getuLoginId() {
		return uLoginId;
	}

	public void setuLoginId(String uLoginId) {
		this.uLoginId = uLoginId;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public boolean isuActiveStatus() {
		return uActiveStatus;
	}

	public void setuActiveStatus(boolean uActiveStatus) {
		this.uActiveStatus = uActiveStatus;
	}

	public String getuSecurityQuestionStatus() {
		return uSecurityQuestionStatus;
	}

	public void setuSecurityQuestionStatus(String uSecurityQuestionStatus) {
		this.uSecurityQuestionStatus = uSecurityQuestionStatus;
	}

	public UserRegistrationModel getUserRegistrationModel() {
		return userRegistrationModel;
	}

	public void setUserRegistrationModel(UserRegistrationModel userRegistrationModel) {
		this.userRegistrationModel = userRegistrationModel;
	}
	

	
	
	
	
}
