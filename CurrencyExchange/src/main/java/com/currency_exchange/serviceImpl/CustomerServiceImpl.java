package com.currency_exchange.serviceImpl;

import com.currency_exchange.dto.CustomerDto;
import com.currency_exchange.entity.CustomerDetails;
import com.currency_exchange.repository.ICustomerRepository;
import com.currency_exchange.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public CustomerDto createCustomer(CustomerDto customerDto)
    {
        CustomerDetails customerDetails = new CustomerDetails();
        CustomerDto savedCustomerDto = new CustomerDto();
        BeanUtils.copyProperties(customerDto,customerDetails);
        customerDetails.setRolesENum(customerDto.getRolesENum());
        System.out.println(customerDetails);
        CustomerDetails savedCustomerDetails= iCustomerRepository.save(customerDetails);
        BeanUtils.copyProperties(savedCustomerDetails,savedCustomerDto);
        return savedCustomerDto;
    }

    public Boolean deleteCustomer(String email)
    {
        Optional<CustomerDetails> customerDetails =(Optional<CustomerDetails>)iCustomerRepository.findByEmail(email);
        if(!customerDetails.isEmpty())
        iCustomerRepository.deleteById(customerDetails.get().getCustomerId());
        else return false;
        return true;
    }

    public CustomerDto updatCustomer(CustomerDto customerDto)
    {
        return new CustomerDto();
    }
}

