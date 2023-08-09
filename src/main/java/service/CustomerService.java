package service;

import entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    Customer update(Customer customer);
    void delete(int id);
}
