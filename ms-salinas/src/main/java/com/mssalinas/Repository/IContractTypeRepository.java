package com.mssalinas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mssalinas.Entity.ContractType;



public interface IContractTypeRepository extends JpaRepository<ContractType, Integer>{

	@Query("SELECT cot FROM ContractType cot WHERE cot.contractTypeId = :contractTypeId AND cot.isActive = 1")
	ContractType getActiveById(@Param("contractTypeId") int contractTypeId);

}
