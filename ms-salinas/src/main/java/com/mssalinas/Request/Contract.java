package com.mssalinas.Request;

import java.time.LocalDateTime;

public class Contract {


	private int contractId;
	private LocalDateTime dateCreated;
	private LocalDateTime dateForm;
	private LocalDateTime dateTo;
	private int isActive;
	private int salaryPerDay;
	private int employeeId;
	
	public Contract () {
		
	}
	
	
	public Contract(int contractId, LocalDateTime dateCreated, LocalDateTime dateForm, LocalDateTime dateTo,
			int isActive, int salaryPerDay, int employeeId) {
		super();
		this.contractId = contractId;
		this.dateCreated = dateCreated;
		this.dateForm = dateForm;
		this.dateTo = dateTo;
		this.isActive = isActive;
		this.salaryPerDay = salaryPerDay;
		this.employeeId = employeeId;
	}


	public int getContractId() {
		return contractId;
	}


	public void setContractId(int contractId) {
		this.contractId = contractId;
	}


	public LocalDateTime getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}


	public LocalDateTime getDateForm() {
		return dateForm;
	}


	public void setDateForm(LocalDateTime dateForm) {
		this.dateForm = dateForm;
	}


	public LocalDateTime getDateTo() {
		return dateTo;
	}


	public void setDateTo(LocalDateTime dateTo) {
		this.dateTo = dateTo;
	}


	public int getIsActive() {
		return isActive;
	}


	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}


	public int getSalaryPerDay() {
		return salaryPerDay;
	}


	public void setSalaryPerDay(int salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
	
	
}
