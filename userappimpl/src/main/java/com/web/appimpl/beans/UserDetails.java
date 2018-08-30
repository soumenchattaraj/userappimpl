package com.web.appimpl.beans;

public class UserDetails {

	
	private String id;
	private String fname;
	
	
	public UserDetails() {
		super();
	}
	
	public UserDetails(String id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	
	
}
