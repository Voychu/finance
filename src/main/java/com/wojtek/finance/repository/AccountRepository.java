package com.wojtek.finance.repository;

import com.wojtek.finance.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account,UUID> {
}
