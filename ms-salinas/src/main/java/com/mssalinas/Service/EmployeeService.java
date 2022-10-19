package com.mssalinas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mssalinas.Dto.EmployeeRequestDTO;
import com.mssalinas.Entity.Employee;
import com.mssalinas.Repository.IEmployeeRepository;



public class EmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;
	
public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}
public Employee save(EmployeeRequestDTO req) {
	Employee newEmployee = new Employee();
	this.searchEmployeeByTaxId(req.getTaxIdNumber());
	
	
	return employeeRepository.save(newEmployee);
			
}
private void searchEmployeeByTaxId(int taxIdNumber) {
	
	
}
public Employee update(EmployeeRequestDTO req, int employeeId) {
	Employee employee = employeeRepository.getReferenceById(employeeId);
	
	if(!employee.getTaxIdNumber().equals(req.getTaxIdNumber())) {
		this.searchEmployeeByTaxId(req.getTaxIdNumber());
		employee.setTaxIdNumber(req.getTaxIdNumber());
	}
	employee.setName(req.getName());
	employee.setLastName(req.getLastName());
	employee.setEmail(req.getEmail());
	int cellPhone = 0;
	employee.setCellPhone(cellPhone);
	
	return employeeRepository.save(employee);
}
	
}
