package com.web.appimpl.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransactionDetailsBean {
	
	private Date timeStamp;
	private String level;
	
	public TransactionDetailsBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TransactionDetailsBean(Date timeStamp, String level) {
		super();
		this.timeStamp = timeStamp;
		this.level = level;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "TransactionDetailsBean [timeStamp=" + timeStamp + ", level=" + level + "]";
	}
	
	
	
	
	

}
