package com.wojtek.finance.service;


import com.wojtek.finance.model.Expense;
import com.wojtek.finance.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Autowired
    AccountService accountService;

    public Expense addAnExpense(Expense expense){
        accountService.deleteFromAccountsAmount(expense);
        return expenseRepository.save(expense);
    }
}
