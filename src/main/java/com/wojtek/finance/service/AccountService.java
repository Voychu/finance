package com.wojtek.finance.service;


import com.wojtek.finance.model.Account;
import com.wojtek.finance.model.Expense;
import com.wojtek.finance.model.Income;
import com.wojtek.finance.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account createAnAccount(Account account){
        return accountRepository.save(account);
    }

    public BigDecimal getAccountsAmount(UUID id){
        Optional<Account> accountOpt = accountRepository.findById(id);
        if(accountOpt.isPresent()){
            return accountOpt.get().getAmount();
        }else{
            return null;
        }
    }

    public Account addToAccountsAmount(Income income){
        BigDecimal result = income.getAccount().getAmount().add(income.getAmount());
        income.getAccount().setAmount(result);
        return accountRepository.save(income.getAccount());
    }

    public Account deleteFromAccountsAmount(Expense expense){
        BigDecimal result = expense.getAccount().getAmount().subtract(expense.getAmount());
        expense.getAccount().setAmount(result);
        return accountRepository.save(expense.getAccount());
    }
}
