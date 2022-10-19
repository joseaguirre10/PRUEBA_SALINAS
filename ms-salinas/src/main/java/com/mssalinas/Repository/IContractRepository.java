package com.mssalinas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mssalinas.Entity.Contract;
import com.mssalinas.Entity.Employee;




public interface IContractRepository extends JpaRepository<Contract,Integer> {
	@Query("SELECT co FROM  co WHERE CONTRACT co.employee And co.isActive = 1")
	Contract findActiveContract(@Param("employee")Employee employee);	
}
