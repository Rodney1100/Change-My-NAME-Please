package com.company.M4Summative.controller;

import com.company.M4Summative.repository.SaleTaxRateRepository;
import com.company.M4Summative.model.SalesTaxRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/salesTaxRate")

public class SalesTaxRateController {
    @Autowired
    private SaleTaxRateRepository salesTaxRate;
}
