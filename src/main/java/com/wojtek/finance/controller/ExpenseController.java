package com.wojtek.finance.controller;

import com.wojtek.finance.model.Expense;
import com.wojtek.finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @PostMapping("/expense")
    public ResponseEntity<Expense> addAnExpense(@RequestBody Expense expense){
        return new ResponseEntity<>(expenseService.addAnExpense(expense), HttpStatus.OK);
    }
}
