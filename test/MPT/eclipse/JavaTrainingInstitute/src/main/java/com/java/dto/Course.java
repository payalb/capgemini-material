package com.java.dto;

public class Course {

	private String name;
	private String syllabus;
	private float fees;
	private float duration;
	private String location;
	private ModeOfDelivery mode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSyllabus() {
		return syllabus;
	}
	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ModeOfDelivery getMode() {
		return mode;
	}
	public void setMode(ModeOfDelivery mode) {
		this.mode = mode;
	}
}
