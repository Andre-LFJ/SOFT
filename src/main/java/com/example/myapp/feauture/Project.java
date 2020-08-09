package com.example.myapp.feauture;

import java.sql.Timestamp;

public class Project {

	private Long projectNumber;
	private String financier;
	private Timestamp startDate;
	private Timestamp endDate;
	
	
	
	public Project(Long projectNumber, String financier, Timestamp startDate, Timestamp endDate) {
		this.projectNumber = projectNumber;
		this.financier = financier;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(Long projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getFinancier() {
		return financier;
	}

	public void setFinancier(String financier) {
		this.financier = financier;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Project() {}

}