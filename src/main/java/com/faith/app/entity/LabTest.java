package com.faith.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LabTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer labTestId;
	
	private String unit;
	
	private Double highRange;
	
	private Double lowRange;
	
	private String testName;
	
	private Double testPrice;
	
	private boolean isActive;
	 
	private String testNo;

	public LabTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getLabTestId() {
		return labTestId;
	}

	public void setLabTestId(Integer labTestId) {
		this.labTestId = labTestId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getHighRange() {
		return highRange;
	}

	public void setHighRange(Double highRange) {
		this.highRange = highRange;
	}

	public Double getLowRange() {
		return lowRange;
	}

	public void setLowRange(Double lowRange) {
		this.lowRange = lowRange;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Double getTestPrice() {
		return testPrice;
	}

	public void setTestPrice(Double testPrice) {
		this.testPrice = testPrice;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getTestNo() {
		return testNo;
	}

	public void setTestNo(String testNo) {
		this.testNo = testNo;
	}
	
	

}
