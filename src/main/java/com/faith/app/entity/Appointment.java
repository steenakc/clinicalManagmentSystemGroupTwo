package com.faith.app.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentId;
	
	private LocalDateTime appointmentDateTime;
	
	private String opToken;
	
	private boolean isActive;
	
	private LocalTime attendedTime;
	
	private boolean doctorStatus;
	
	@ManyToOne
	@JoinColumn(name="patientId",insertable = false,updatable = false)
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="doctorId",insertable = false,updatable = false)
	private Doctor doctor;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	public String getOpToken() {
		return opToken;
	}

	public void setOpToken(String opToken) {
		this.opToken = opToken;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public LocalTime getAttendedTime() {
		return attendedTime;
	}

	public void setAttendedTime(LocalTime attendedTime) {
		this.attendedTime = attendedTime;
	}

	public boolean isDoctorStatus() {
		return doctorStatus;
	}

	public void setDoctorStatus(boolean doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	

	

}
