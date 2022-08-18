package com.example.spring_boot_app.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Customer {
    @Id
    private Long id ;
    private String name ;
    private String email ;
}
