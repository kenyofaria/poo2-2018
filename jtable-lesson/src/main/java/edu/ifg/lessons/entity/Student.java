package edu.ifg.lessons.entity;

public class Student {

	private String registrationNumber;
	private String name;
	
	public Student() {
		
	}
	
	public Student(String registrationNumber, String name) {
		super();
		this.registrationNumber = registrationNumber;
		this.name = name;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
