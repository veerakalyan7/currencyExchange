package com.currency_exchange.dto;

import com.currency_exchange.userenum.RolesEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class CustomerDto {

    //private Long customerId;
    private String username;

    private String password;

    private String email;

    private Long phoneNumber;

    @Enumerated(EnumType.STRING)
    private RolesEnum rolesENum;


}
