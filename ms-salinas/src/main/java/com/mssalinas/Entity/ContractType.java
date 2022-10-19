package com.mssalinas.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CONTRACT_TYPE")
public class ContractType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cont_id")
	@SequenceGenerator(name="cont_id",sequenceName="CONTRACT_TYPE_SEQ",allocationSize=1)

	@Column(name="CONTRACT_TYPE_ID",columnDefinition="NUMBER")
	private int contractTypeId;
	
	@Column(name="DATE_CREATED",columnDefinition="DATE")
	private LocalDateTime dateCreated;
	
	@Column(name="DESCRIPTION",columnDefinition="NVARCHAR2(50)")
	private String decription;
	
	@Column(name="IS_ACTIVE",columnDefinition="NUMBER")
	private int isActive;
	
	@Column(name="NAME",columnDefinition="NVARCHAR2(30)")
	private String name;

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

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
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
