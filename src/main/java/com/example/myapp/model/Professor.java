package com.example.myapp.model;

public class Professor{

	private String name;
	private Integer age;
	private String speciality;
	private String classRoom;


	public Professor(String name, Integer age, String userType, String speciality, String classRoom) {
		this.name = name;
		this.age = age;
		this.speciality = speciality;
		this.classRoom = classRoom;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public String getClassroom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


}

