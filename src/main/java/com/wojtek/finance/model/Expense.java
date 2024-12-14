package com.wojtek.finance.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name="expenses")
public class Expense {

    @Id
    @Column(name="expense_id")
    private UUID expense_id;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name="description")
    private String description;

    @Column(name="expense_date")
    private LocalDate expense_date;

    @Column(name="priority")
    private Priority priority;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;
}
