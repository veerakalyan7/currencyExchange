package com.currency_exchange.service;

import com.currency_exchange.dto.CustomerDto;
import com.currency_exchange.entity.CustomerDetails;

import java.util.Optional;

public interface CustomerService
{
    CustomerDto createCustomer(CustomerDto customerDto);
    Boolean deleteCustomer(String email);

    CustomerDto updateCustomer(CustomerDto customerDto);
}
