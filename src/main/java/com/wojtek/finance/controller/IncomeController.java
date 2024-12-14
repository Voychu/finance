package com.wojtek.finance.controller;


import com.wojtek.finance.model.Income;
import com.wojtek.finance.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/income")
public class IncomeController {


    @Autowired
    IncomeService incomeService;

    @PostMapping("/income")
    public ResponseEntity<Income> addAnIncome(@RequestBody Income income){
        return new ResponseEntity<>(incomeService.addAnIncome(income), HttpStatus.OK);
    }
}
