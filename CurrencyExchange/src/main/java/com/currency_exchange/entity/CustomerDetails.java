package com.currency_exchange.entity;


import com.currency_exchange.userenum.RolesEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String username;

    private String password;

    @Column(unique = true)
    private String email;

//    private String currencyType;
//
//    private BigDecimal balance;

    private Long phoneNumber;

    @Column(name = "role", columnDefinition = "varchar(20)")
    @Enumerated(EnumType.STRING)
    private RolesEnum rolesENum;

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerId=" + customerId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", rolesENum=" + rolesENum +
                '}';
    }
}
