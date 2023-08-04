package com.currency_exchange.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Getter
@Setter
public class OrderDetails
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal transferAmt;
    private Long debitAccount;
    private Long creditAccount;

    private String debitCurrency;
    private String creditCurrency;

    private BigDecimal rate;

    private Date date;


}
