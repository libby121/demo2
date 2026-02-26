package com.example.demo2.customer.mapper;

import com.example.demo2.customer.dto.CustomerDto;
import com.example.demo2.customer.entity.Customer;

public class CustomerMapper {

    public static Customer dtoToCustomer(CustomerDto dt){
       Customer c1= new Customer() ;
       c1.setMail(dt.mail());
       c1.setName(dt.name());
       return c1;
    }

    public static  CustomerDto customerTOdTO(Customer c1){
        return new CustomerDto(c1.getName(),c1.getMail());
    }
}
