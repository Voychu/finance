package com.wojtek.finance.controller;


import com.wojtek.finance.model.Account;
import com.wojtek.finance.service.AccountService;
import com.wojtek.finance.service.ExpenseService;
import com.wojtek.finance.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    ExpenseService expenseService;

    @Autowired
    IncomeService incomeService;

    @GetMapping("/hi")
    public ResponseEntity<String> getAllUsersExpenses(@AuthenticationPrincipal OAuth2User principal){
        System.out.println(principal);
        return new ResponseEntity<>("Hi", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Account> createAnAccount(@RequestBody Account account){
        return new ResponseEntity<>(accountService.createAnAccount(account), HttpStatus.CREATED);
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<BigDecimal> getAccountsAmount(@PathVariable UUID id){
        return new ResponseEntity<>(accountService.getAccountsAmount(id), HttpStatus.OK);
    }

}
