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
@Table(name="user_role",schema="user_authentication")
public class UserRole {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_role_pk")
	private int u_RolePk;
	
	
	
	@Column(name="u_registartion_fk",unique=true)
	private int uRegistartionFk;
	
	@Column(name="u_role",columnDefinition= "character varying DEFAULT 'VIEWER'::character varying")
	private String uRole;

	
	public UserRole() {
		super();
	}

	public int getU_RolePk() {
		return u_RolePk;
	}

	public void setU_RolePk(int u_RolePk) {
		this.u_RolePk = u_RolePk;
	}

	public int getuRegistartionFk() {
		return uRegistartionFk;
	}

	public void setuRegistartionFk(int uRegistartionFk) {
		this.uRegistartionFk = uRegistartionFk;
	}

	public String getuRole() {
		return uRole;
	}

	public void setuRole(String uRole) {
		this.uRole = uRole;
	}

	
	
	

}
