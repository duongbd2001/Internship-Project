package com.example.demo.service;

import com.example.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    Customer update(Customer customer);
    void delete(int id);
}
