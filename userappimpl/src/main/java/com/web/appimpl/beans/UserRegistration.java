package com.web.appimpl.beans;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserRegistration {

	private String u_id;
	private String u_fname;
	private String u_mname;
	private String u_lname;
	private Date u_dob;
	private long u_ph;
	private String u_email;
	private String u_address;

	public UserRegistration() {
		super();
	}

	public UserRegistration(String u_id, 
			String u_fname, String u_mname, String u_lname, Date u_dob, long u_ph,
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

	
	@Override
	public String toString() {
		return "UserLoginBean [u_id=" + u_id + ", u_fname=" + u_fname + ", u_mname=" + u_mname + ", u_lname=" + u_lname
				+ ", u_dob=" + u_dob + ", u_ph=" + u_ph + ", u_email=" + u_email + ", u_address=" + u_address + "]";
	}
	
	
	
	
	

}
