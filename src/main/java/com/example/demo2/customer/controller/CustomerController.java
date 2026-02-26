package com.example.demo2.customer.controller;

import com.example.demo2.customer.dto.CustomerDto;
import com.example.demo2.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService cs){
        this.customerService=cs;
    }

    //test merge conflict in branch 1
    @GetMapping("one/{id}")
    public ResponseEntity<CustomerDto>getOne(@PathVariable int id){
            return ResponseEntity.ok(customerService.getOne(id));
    }
    @PostMapping("add")
    public ResponseEntity<CustomerDto>add(@RequestBody CustomerDto dto){
        return ResponseEntity.ok(customerService.add(dto));
    }
}
