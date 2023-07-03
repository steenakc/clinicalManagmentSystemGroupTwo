package com.faith.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MedicineCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medicneCompanyId;
	
	private String companyName;
	private String companyAddress;

	private String contactNo;
	
	private boolean isActive;

	public MedicineCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getMedicneCompanyId() {
		return medicneCompanyId;
	}

	public void setMedicneCompanyId(Integer medicneCompanyId) {
		this.medicneCompanyId = medicneCompanyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

	

}
