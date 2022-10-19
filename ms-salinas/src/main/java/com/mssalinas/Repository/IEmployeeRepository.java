package com.mssalinas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mssalinas.Entity.Employee;



public interface IEmployeeRepository  extends JpaRepository<Employee, Integer >{
	
	@Query("SELECT em FROM Employee em WHERE em.taxIdNumber = :taxIdNumber")
	Employee searchByTaxIdNumber(@Param("taxIdNumber") String  taxIdNumber);

	Employee getReferenceById(int employeeId);

}
