package com.currency_exchange.entity;

import lombok.Getter;
import lombok.Setter;

import javax.management.Query;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class AccountDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;

    private String accHolderName;

    private  String currencyType;

    private BigDecimal accBalance;

}
