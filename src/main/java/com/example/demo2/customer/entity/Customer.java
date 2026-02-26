package com.example.demo2.customer.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Customer {

    @Id
    private int id;

    private String name;

    private String mail;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(mail, customer.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mail);
    }
}
