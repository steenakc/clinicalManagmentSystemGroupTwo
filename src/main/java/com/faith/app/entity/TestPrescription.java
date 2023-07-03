package com.faith.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TestPrescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testPrescriptionId;
	
	private LocalDate testPrescriptionDate;
	
	private LocalDate reportCreateDate;
	
	private Double actualValue;
	
	private boolean labStatus;
	
	@ManyToOne
	@JoinColumn(name="appointmentId",insertable = false,updatable = false)
	private Appointment appointment;
	@ManyToOne
	@JoinColumn(name="labTestId",insertable = false,updatable = false)
	private LabTest labTest;
	public TestPrescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getTestPrescriptionId() {
		return testPrescriptionId;
	}
	public void setTestPrescriptionId(Integer testPrescriptionId) {
		this.testPrescriptionId = testPrescriptionId;
	}
	public LocalDate getTestPrescriptionDate() {
		return testPrescriptionDate;
	}
	public void setTestPrescriptionDate(LocalDate testPrescriptionDate) {
		this.testPrescriptionDate = testPrescriptionDate;
	}
	public LocalDate getReportCreateDate() {
		return reportCreateDate;
	}
	public void setReportCreateDate(LocalDate reportCreateDate) {
		this.reportCreateDate = reportCreateDate;
	}
	public Double getActualValue() {
		return actualValue;
	}
	public void setActualValue(Double actualValue) {
		this.actualValue = actualValue;
	}
	public boolean isLabStatus() {
		return labStatus;
	}
	public void setLabStatus(boolean labStatus) {
		this.labStatus = labStatus;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public LabTest getLabTest() {
		return labTest;
	}
	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
	}
	
	
	


}
