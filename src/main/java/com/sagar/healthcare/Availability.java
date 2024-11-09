package com.sagar.healthcare;

import java.time.DayOfWeek;
import java.time.LocalTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Embeddable

//@Entity
//@Table(name = "availability")
public class Availability {
	
	//@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
	
	@Enumerated(EnumType.STRING)
    private DayOfWeek day;

    private LocalTime startTime;

    private LocalTime endTime;
    
    //@ManyToOne
    //private Doctor doctor; // To link availability with the doctor


	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	/*
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
    */
    
}
