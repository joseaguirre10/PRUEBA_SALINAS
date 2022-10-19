package com.msalinas.Controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mssalinas.Dto.EmployeeDTO;
import com.mssalinas.Dto.EmployeeRequestDTO;
import com.mssalinas.Entity.Employee;
import com.mssalinas.Service.EmployeeService;



@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(path = "mostrar-todos")
	public ResponseEntity<List<EmployeeDTO>> getEmployees() {
		List<Employee> employees = employeeService.findAll();
		List<EmployeeDTO> res =  employees.stream().map(e -> new EmployeeDTO(e)).collect(Collectors.toList());
		return new ResponseEntity<List<EmployeeDTO>>(res, HttpStatus.OK);
	}
	@PostMapping(path = "agregar-empleado")
	public ResponseEntity<EmployeeDTO> addEmployee(@Valid @RequestBody EmployeeRequestDTO req) {
		
		
		Employee newEmployee = employeeService.save(req);
		return new ResponseEntity<EmployeeDTO>(new EmployeeDTO(newEmployee), HttpStatus.CREATED);
	}
	
	@PatchMapping(path = "/id/{employeeId}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable int employeeId, @Valid @RequestBody EmployeeRequestDTO req) {
		Employee employee = employeeService.update(req, employeeId);
		return new ResponseEntity<EmployeeDTO>(new EmployeeDTO(employee), HttpStatus.CREATED);
	}
}
