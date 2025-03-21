package com.cognizant.entity;

import jakarta.persistence.*;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int appointmentID;
	
	@ManyToOne
	@JoinColumn(name="patientID")
	private User patient;
	
	@JoinColumn(name="doctorID")
	private User doctor;
	//declare TimeSlot
	
	@Enumerated(EnumType.STRING)
	private Status status;
	public enum Status{
		BOOKED, CANCELLED, COMPLETED;
	}

}
