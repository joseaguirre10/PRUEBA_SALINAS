package com.mssalinas.Request;

import java.time.LocalDateTime;

public class Employee {

	 private int idEmployee;
	 private LocalDateTime birthDate;
	 private int cellPhone;
	 private LocalDateTime dateCreated;
	 private String email;
	 private int isActive;
	 private String lastName;
	 private String name;
	 private String taxIdNumber;
	 
	 public Employee() {
	  
	 }

	 public Employee(int idEmployee, LocalDateTime birthDate, int cellPhone, LocalDateTime dateCreated, String email,
	   int isActive, String lastName, String name, String taxIdNumber) {
	  super();
	  this.idEmployee = idEmployee;
	  this.birthDate = birthDate;
	  this.cellPhone = cellPhone;
	  this.dateCreated = dateCreated;
	  this.email = email;
	  this.isActive = isActive;
	  this.lastName = lastName;
	  this.name = name;
	  this.taxIdNumber = taxIdNumber;
	 }

	 public int getIdEmployee() {
	  return idEmployee;
	 }

	 public void setIdEmployee(int idEmployee) {
	  this.idEmployee = idEmployee;
	 }

	 public LocalDateTime getBirthDate() {
	  return birthDate;
	 }

	 public void setBirthDate(LocalDateTime birthDate) {
	  this.birthDate = birthDate;
	 }

	 public int getCellPhone() {
	  return cellPhone;
	 }

	 public void setCellPhone(int cellPhone) {
	  this.cellPhone = cellPhone;
	 }

	 public LocalDateTime getDateCreated() {
	  return dateCreated;
	 }

	 public void setDateCreated(LocalDateTime dateCreated) {
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

}
