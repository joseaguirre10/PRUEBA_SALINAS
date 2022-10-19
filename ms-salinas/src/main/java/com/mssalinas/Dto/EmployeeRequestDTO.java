package com.mssalinas.Dto;

import java.sql.Date;



public class EmployeeRequestDTO {

	private int taxIdNumber;
	
	private String name;
	
	
	private String lastName;
	
	
	private Date birthDate;
	
	private int isActive;
	
	private String email;
	
	
	private int cellPhone;


	public int getTaxIdNumber() {
		return taxIdNumber;
	}


	public void setTaxIdNumber(int taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public int getIsActive() {
		return isActive;
	}


	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCellPhone() {
		return cellPhone;
	}


	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	
	

}
