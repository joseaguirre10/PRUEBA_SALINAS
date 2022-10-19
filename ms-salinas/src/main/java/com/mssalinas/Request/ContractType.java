package com.mssalinas.Request;

import java.time.LocalDateTime;

public class ContractType {

	private int contractTypeId;
	private LocalDateTime dateCreated;
	private String description;
	private int isActive ;
	private String name;
	
	public ContractType() {
		// TODO Auto-generated constructor stub
	}

	public ContractType(int contractTypeId, LocalDateTime dateCreated, String description, int isActive, String name) {
		super();
		this.contractTypeId = contractTypeId;
		this.dateCreated = dateCreated;
		this.description = description;
		this.isActive = isActive;
		this.name = name;
	}

	public int getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(int contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
