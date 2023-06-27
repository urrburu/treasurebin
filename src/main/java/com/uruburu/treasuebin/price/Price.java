package com.uruburu.treasuebin.price;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.time.LocalDateTime;

@Entity
public class Price {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime createdAt;

    private Integer initialPrice;

    private Integer maginotPrice;


}
