package com.mssalinas.Dto;

import java.sql.Date;
import java.util.List;

import com.mssalinas.Entity.Contract;
import com.mssalinas.Entity.Employee;

import java.sql.Date;
import java.util.List;

public class EmployeeDTO {

	

	private String name;
	
	private String lastName;
	
	private String email;

	private Date contractStart;
	
	private Date contractEnd;
	
	private String contractType;
	
	private String taxIdNumber;
	
	public EmployeeDTO(Employee employee) {
		this.name = employee.getName();
		this.lastName = employee.getLastName();
		this.taxIdNumber = employee.getTaxIdNumber();
		this.email = employee.getEmail();
		
			
		;
		
	
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

	public String getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Date getContractStart() {
		return contractStart;
	}

	public void setContractStart(Date contractStart) {
		this.contractStart = contractStart;
	}

	public Date getContractEnd() {
		return contractEnd;
	}

	public void setContractEnd(Date contractEnd) {
		this.contractEnd = contractEnd;
	}

}
