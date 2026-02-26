package com.example.demo2.customer.service;

import com.example.demo2.customer.dto.CustomerDto;
import com.example.demo2.customer.entity.Customer;
import com.example.demo2.customer.mapper.CustomerMapper;
import com.example.demo2.customer.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;
    //constructor injection
    public CustomerService(CustomerRepo ct){
        this.customerRepo=ct;
    }

    public CustomerDto getOne(int id){
        Customer c1= customerRepo.findById(id).orElse(new Customer(100,"libby","loveyou"));
        return CustomerMapper.customerTOdTO(c1);
    }
    public CustomerDto add( CustomerDto dt){
        Customer c1= new Customer();
        c1.setName(dt.name());
        c1.setMail(dt.mail());
        customerRepo.save(c1);
        return CustomerMapper.customerTOdTO(c1);
    }
    public CustomerDto update(int id, CustomerDto dt){
        Customer c1= customerRepo.findById(id).orElse(new Customer(100,"libby","loveyou"));
        c1.setName(dt.name());
        c1.setMail(dt.mail());
        customerRepo.save(c1);
        return CustomerMapper.customerTOdTO(c1);
    }
}
