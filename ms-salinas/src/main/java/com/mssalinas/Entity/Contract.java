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
@Table(name="CONTRACT")
public class Contract  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="con_id")
	@SequenceGenerator(name="con_id",sequenceName="CONTRACT_SEQ",allocationSize=1)
	
	@Column(name="CONTRACT_ID",columnDefinition="NUMBER")
	private int contractId;
	
	@Column(name="DATE_CREATED",columnDefinition="DATE")
	private LocalDateTime dateCreated;
	
	@Column(name="DATE_FORM",columnDefinition="DATE")
	private LocalDateTime dateForm;
	
	@Column(name="DATE_TO",columnDefinition="DATE")
	private LocalDateTime dateTo;
	
	@Column(name="IS_ACTIVE",columnDefinition="NUMBER")
	private int isActive;
	
	@Column(name="SALARY_PER_DAY",columnDefinition="NUMBER")
	private int salaryPerDay;
	
	@Column(name="CONTRACT_TYPE_ID",columnDefinition="NUMBER")
	private int contractTypeId;
	
	@Column(name="EMPLOYEE_ID",columnDefinition="NUMBER")
	private int employeeId;

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

	public int getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(int contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	
	
	

}
