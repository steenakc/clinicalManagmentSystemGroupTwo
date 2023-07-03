package com.faith.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medicineId;
	
	private String medicineName;
	
	private Double rate;
	
	@ManyToOne
	@JoinColumn(name="medicneCompanyId",insertable = false,updatable = false)
	private MedicineCompany medicineCompany;

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(Integer medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public MedicineCompany getMedicineCompany() {
		return medicineCompany;
	}

	public void setMedicineCompany(MedicineCompany medicineCompany) {
		this.medicineCompany = medicineCompany;
	}
	
	
	

}
