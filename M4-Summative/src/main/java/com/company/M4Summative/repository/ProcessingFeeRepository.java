package com.company.M4Summative.repository;

import com.company.M4Summative.model.SalesTaxRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingFeeRepository extends JpaRepository<SalesTaxRate, Integer> {

}

