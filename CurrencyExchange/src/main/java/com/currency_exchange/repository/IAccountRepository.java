package com.currency_exchange.repository;

import com.currency_exchange.entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<AccountDetails, Long> {



}
