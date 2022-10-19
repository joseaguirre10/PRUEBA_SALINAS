package com.mssalinas.Service;

import java.sql.Date;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mssalinas.Dto.ContractRequestDTO;
import com.mssalinas.Entity.Contract;
import com.mssalinas.Entity.ContractType;
import com.mssalinas.Entity.Employee;
import com.mssalinas.Repository.IContractRepository;
import com.mssalinas.Repository.IContractTypeRepository;
import com.mssalinas.Repository.IEmployeeRepository;


@Service
public class ContractService {

	@Autowired
	IContractRepository contractRepository;
	
	@Autowired
	IContractTypeRepository contractTypeRepository;
	
	@Autowired
	IEmployeeRepository employeeRepository;
	
	public Contract guardar(@Valid ContractRequestDTO req) {
	
		Employee employee =  employeeRepository.getReferenceById(req.getEmployeeId());
		
		if(employee == null) {
			throw new ConstraintViolationException("EMPLEADO NO ENCONTRADO", null); 
		}
		
		ContractType contractType = contractTypeRepository.getActiveById(req.getContractTypeId());
		
		if(contractType == null) {
			throw new ConstraintViolationException("CONTRATO NO ENCONTRADO", null); 
		}
		
		Contract contract = contractRepository.findActiveContract(employee);
		Contract newContract = new Contract();
		
		if(contract != null) {
			contract.setIsActive(1);
			contract.setDateTo(null);
			contractRepository.save(contract);
		}
		
		newContract.setContractId(req.getContractTypeId());
		newContract.setDateForm(null);
		newContract.setDateTo(null);
		newContract.setSalaryPerDay(req.getSalaryPerDay());
		newContract.setIsActive(1);
		newContract.setDateCreated(null);
		newContract.setContractTypeId(1);
		
		contractRepository.save(newContract);
		
		return newContract;
	}
	
	public Contract borrarContrato(int employeeId) {
		Employee employee = employeeRepository.getReferenceById(employeeId);
		
		if(employee == null) {
			throw new ConstraintViolationException("EMPLEADO NO ENCONTRADO", null); 
		}
		
		Contract contract = contractRepository.findActiveContract(employee);
		
		if(contract == null) {
			throw new ConstraintViolationException("CONTRATO NO ENCONTRADO", null); 
		}
		
		contract.setIsActive(2);
		contractRepository.save(contract);
		return contract;
		
	}



}
