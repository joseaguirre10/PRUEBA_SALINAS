package com.mssalinas.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.mssalinas.Dto.EmployeeRequestDTO;





@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable{
	
	public Employee() {
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="em_id")
	@SequenceGenerator(name="em_id",sequenceName="EMPLOYEE_SEQ",allocationSize=1)

	@Column(name="EMPLOYEE_ID",columnDefinition="NUMBER")
	private int idEmployee;
	
	
	@Column(name="BIRTH_DAY",columnDefinition="DATE")
	private LocalDateTime birthDay;
	
	@Column(name="CELL_PHONE",columnDefinition="NUMBER")
	private int cellPhone;
	
	@Column(name="DATE_CREATED",columnDefinition="DATE")
	private Date dateCreated;
	
	@Column(name="EMAIL",columnDefinition="NVARCHAR(30)")
	private String email;
	
	@Column(name="IS_ACTIVE",columnDefinition="NUMBER")
	private int isActive;
	
	@Column(name="LAST_NAME",columnDefinition="NVARCHAR(30)")
	private String lastName;
	
	@OneToMany(mappedBy="employee")
	private List<Contract> contract;
	
	@Column(name="NAME",columnDefinition="NVARCHAR2(30)")
	private String name;
	
	@Column(name="TAX_ID_NUMBER",columnDefinition="NVARCHAR2(20)")
	private String taxIdNumber;
	private Date birthDate;
	
	

	public Employee(EmployeeRequestDTO req) {
		this.name = req.getName();
		this.lastName = req.getLastName();
		this.birthDate= req.getBirthDate();
		this.email = req.getEmail();
		this.cellPhone = req.getCellPhone();
		this.isActive = 1;
		this.dateCreated = new Date(new java.util.Date().getTime());
	}
	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public LocalDateTime getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDateTime birthDay) {
		this.birthDay = birthDay;
	}

	public int getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}
	public List<Contract> getContract() {
		
		return null;
	}

	

	

}
