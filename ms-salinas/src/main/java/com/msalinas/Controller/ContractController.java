package com.msalinas.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mssalinas.Dto.ContractRequestDTO;
import com.mssalinas.Dto.EmployeeDTO;
import com.mssalinas.Entity.Contract;
import com.mssalinas.Service.ContractService;


@RestController
@RequestMapping("/contratos")
public class ContractController {

	
	
		@Autowired
		ContractService contractService;
		
		@PostMapping(path = "crear-empleado")
		public ResponseEntity<EmployeeDTO> addEmployee(@Valid @RequestBody ContractRequestDTO req) {
			Contract newContract = contractService.guardar(req);
			return null;
			//NO CONCLUIDO
		}
		
		@DeleteMapping(path = "/{empleado-Id}")
		public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable int employeeId, @Valid @RequestBody ContractRequestDTO req) {
			Contract contract = contractService.borrarContrato(employeeId);
			return null;
			//NO CONCLUIDO
		}
	}
