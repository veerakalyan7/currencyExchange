package com.currency_exchange.repository;

import com.currency_exchange.entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ICustomerRepository  extends JpaRepository<CustomerDetails,Long> {

    Optional<CustomerDetails> findByEmail(String email);

}
