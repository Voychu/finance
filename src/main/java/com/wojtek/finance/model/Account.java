package com.wojtek.finance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Table(name="accounts")
public class Account {

    @Id
    @Column(name = "account_id")
    private UUID account_id;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "is_added_to_sum")
    private boolean is_added_to_sum;

}
