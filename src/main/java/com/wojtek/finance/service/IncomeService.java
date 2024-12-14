package com.wojtek.finance.service;


import com.wojtek.finance.model.Income;
import com.wojtek.finance.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeService {

    @Autowired
    IncomeRepository incomeRepository;

    @Autowired
    AccountService accountService;

    public Income addAnIncome(Income income){
        accountService.addToAccountsAmount(income);
        return incomeRepository.save(income);
    }
}
