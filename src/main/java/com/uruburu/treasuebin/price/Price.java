package com.uruburu.treasuebin.price;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Price {

    @Id
    @GeneratedValue
    private Long id;
}
