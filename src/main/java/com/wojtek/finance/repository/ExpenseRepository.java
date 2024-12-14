package com.wojtek.finance.repository;

import com.wojtek.finance.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExpenseRepository extends JpaRepository<Expense,UUID> {
}
