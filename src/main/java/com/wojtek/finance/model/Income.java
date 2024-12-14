package com.wojtek.finance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name="incomes")
public class Income {

    @Id
    @Column(name="income_id")
    private UUID income_id;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name="description")
    private String description;

    @Column(name="income_date")
    private LocalDate income_date;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;
}
