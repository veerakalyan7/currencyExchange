package com.currency_exchange.controller;

import com.currency_exchange.dto.CustomerDto;
import com.currency_exchange.entity.CustomerDetails;
import com.currency_exchange.repository.ICustomerRepository;
import com.currency_exchange.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;
    @PostMapping("/create")
    public CustomerDto createCustomer(CustomerDto customerDto)
    {
        return customerService.createCustomer(customerDto);
    }
    @DeleteMapping("/delete")
    public String deleteCustomer(String email)
    {
        Boolean isDeleted =  customerService.deleteCustomer(email);
        return isDeleted==true?"success":"Unsuccessful";
    }
    @PutMapping("/update")
    public CustomerDto udpateCustomer(CustomerDto customerDto)
    {
        customerService.udpateCustomer();
        return new CustomerDto();
    }
}
