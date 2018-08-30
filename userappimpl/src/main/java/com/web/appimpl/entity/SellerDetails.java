package com.web.appimpl.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller_details",schema="seller")
public class SellerDetails {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_master_pk")
	private int sMasterPk;
	
	@Column(name="s_login_id")
	private String sloginId;
	
	@Column(name="s_registered_address")
	private String sRegisteredAddress;
	
	@Column(name="s_registered_ph")
	private String sRegisteredPh;
	
	@Column(name="s_complain_emailid")
	private String sComplainEmailId;
	
	@Column(name="s_verification_status")
	private boolean sellerVerificationStatus;

	@Column(name="s_registration_date")
	private Date sregistrationDate;
	
	@Column(name="s_active_status")
	private boolean sActiveStatus;

	
	
	
	public SellerDetails() {
		super();
	}


	public SellerDetails(String sloginId, String sRegisteredAddress, String sRegisteredPh,
			String sComplainEmailId, boolean sellerVerificationStatus, Date sregistrationDate, boolean sActiveStatus) {
		super();
		this.sloginId = sloginId;
		this.sRegisteredAddress = sRegisteredAddress;
		this.sRegisteredPh = sRegisteredPh;
		this.sComplainEmailId = sComplainEmailId;
		this.sellerVerificationStatus = sellerVerificationStatus;
		this.sregistrationDate = sregistrationDate;
		this.sActiveStatus = sActiveStatus;
	}

	
	public int getsMasterPk() {
		return sMasterPk;
	}

	public void setsMasterPk(int sMasterPk) {
		this.sMasterPk = sMasterPk;
	}

	public String getSloginId() {
		return sloginId;
	}

	public void setSloginId(String sloginId) {
		this.sloginId = sloginId;
	}

	public String getsRegisteredAddress() {
		return sRegisteredAddress;
	}

	public void setsRegisteredAddress(String sRegisteredAddress) {
		this.sRegisteredAddress = sRegisteredAddress;
	}

	public String getsRegisteredPh() {
		return sRegisteredPh;
	}

	public void setsRegisteredPh(String sRegisteredPh) {
		this.sRegisteredPh = sRegisteredPh;
	}

	public String getsComplainEmailId() {
		return sComplainEmailId;
	}

	public void setsComplainEmailId(String sComplainEmailId) {
		this.sComplainEmailId = sComplainEmailId;
	}

	public boolean isSellerVerificationStatus() {
		return sellerVerificationStatus;
	}

	public void setSellerVerificationStatus(boolean sellerVerificationStatus) {
		this.sellerVerificationStatus = sellerVerificationStatus;
	}

	public Date getSregistrationDate() {
		return sregistrationDate;
	}

	public void setSregistrationDate(Date sregistrationDate) {
		this.sregistrationDate = sregistrationDate;
	}

	public boolean issActiveStatus() {
		return sActiveStatus;
	}

	public void setsActiveStatus(boolean sActiveStatus) {
		this.sActiveStatus = sActiveStatus;
	}
	
	
	
	

}
