package com.product.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ecom_user")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
}
