package com.web.appimpl.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;




@Entity
@Table(name="user_registration",schema="user_authentication")
@SecondaryTables({
	
		//@SecondaryTable(name="user_login",schema="user_authentication"),
		@SecondaryTable(name="user_role",schema="user_authentication",pkJoinColumns=@PrimaryKeyJoinColumn(name="u_role_pk"))	
})
public class UserRegistrationModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_pk")
	private int u_pk;
	
	@Column(name="u_id")
	private String u_id;
	
	@Column(name="u_fname")
	private String u_fname;
	
	@Column(name="u_mname")
	private String u_mname;
	
	@Column(name="u_lname")
	private String u_lname;
	
	@Column(name="u_dob")
	private Date u_dob;
	
	@Column(name="u_ph")
	private long u_ph;
	
	@Column(name="u_emailid")
	private String u_email;
	
	@Column(name="u_address")
	private String u_address;
	
	
	//## for table user_role
	/*@Column(name="u_registartion_fk",nullable=false,unique=true)
	private int uRoleRegistartionFk;*/
	


	@JoinColumn(referencedColumnName="u_pk")
	@Column(name="u_registartion_fk",unique=true,table="user_role")
	private int uRegistartionFk;
	
	@Column(name="u_role",nullable=false,columnDefinition= "character varying DEFAULT 'VIEWER'::character varying",table="user_role")
	private String uRole;

	//## for table user_login
	
	/*@Column(name="u_registartion_fk",nullable=false,table="user_login")
	private int uLoginRegistartionFk;*/
	
	
	/*@Column(name="u_login_id",nullable=false,unique=true,table="user_login")
	private String uLoginId;
	
	@Column(name="u_password",nullable=false,columnDefinition= "character varying DEFAULT 'Pass@123'::character varying",table="user_login")
	private String uPassword;
	
	@Column(name="u_active_status",nullable=false,columnDefinition= "boolean default false",table="user_login")
	private boolean uActiveStatus;
	
	@Column(name="u_squestion_status",nullable=false,length=1,columnDefinition= "character varying DEFAULT 'NA'::character varying",table="user_login")
	private String uSecurityQuestionStatus;*/
	
	
	
	
	
	
	public UserRegistrationModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//## constructor for login table
	/*public UserRegistrationModel(//int uLoginRegistartionFk, 
			String uLoginId, String uPassword, boolean uActiveStatus,
			String uSecurityQuestionStatus) {
		super();
		//this.uLoginRegistartionFk = uLoginRegistartionFk;
		this.uLoginId = uLoginId;
		this.uPassword = uPassword;
		this.uActiveStatus = uActiveStatus;
		this.uSecurityQuestionStatus = uSecurityQuestionStatus;
	}*/



	//## constructor for role table
	public UserRegistrationModel(//int uRoleRegistartionFk, 
			String uRole) {
		super();
		//this.uRoleRegistartionFk = uRoleRegistartionFk;
		this.uRole = uRole;
	}



	//## constructor for registration details table
	public UserRegistrationModel(String u_id, String u_fname, String u_mname, String u_lname, Date u_dob, long u_ph,
			String u_email, String u_address) {
		super();
		this.u_id = u_id;
		this.u_fname = u_fname;
		this.u_mname = u_mname;
		this.u_lname = u_lname;
		this.u_dob = u_dob;
		this.u_ph = u_ph;
		this.u_email = u_email;
		this.u_address = u_address;
	}




	public UserRegistrationModel(String u_id, String u_fname, String u_mname, String u_lname, long u_ph, String u_email,
			String u_address
			//,String uLoginId
			) {
		super();
		this.u_id = u_id;
		this.u_fname = u_fname;
		this.u_mname = u_mname;
		this.u_lname = u_lname;
		this.u_ph = u_ph;
		this.u_email = u_email;
		this.u_address = u_address;
		//this.uLoginId = uLoginId;
	}



	public int getU_pk() {
		return u_pk;
	}

	public void setU_pk(int u_pk) {
		this.u_pk = u_pk;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_fname() {
		return u_fname;
	}

	public void setU_fname(String u_fname) {
		this.u_fname = u_fname;
	}

	public String getU_mname() {
		return u_mname;
	}

	public void setU_mname(String u_mname) {
		this.u_mname = u_mname;
	}

	public String getU_lname() {
		return u_lname;
	}

	public void setU_lname(String u_lname) {
		this.u_lname = u_lname;
	}

	public Date getU_dob() {
		return u_dob;
	}

	public void setU_dob(Date u_dob) {
		this.u_dob = u_dob;
	}

	public long getU_ph() {
		return u_ph;
	}

	public void setU_ph(long u_ph) {
		this.u_ph = u_ph;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	/*public int getuRoleRegistartionFk() {
		return uRoleRegistartionFk;
	}

	public void setuRoleRegistartionFk(int uRoleRegistartionFk) {
		this.uRoleRegistartionFk = uRoleRegistartionFk;
	}
*/
	public String getuRole() {
		return uRole;
	}

	public void setuRole(String uRole) {
		this.uRole = uRole;
	}



	

	/*public int getuLoginRegistartionFk() {
		return uLoginRegistartionFk;
	}

	public void setuLoginRegistartionFk(int uLoginRegistartionFk) {
		this.uLoginRegistartionFk = uLoginRegistartionFk;
	}*/

	/*public String getuLoginId() {
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
	*/
	
	public int getuRegistartionFk() {
		return uRegistartionFk;
	}



	public void setuRegistartionFk(int uRegistartionFk) {
		this.uRegistartionFk = uRegistartionFk;
	}


}
