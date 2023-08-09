package service.impl;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CustomerRepository;
import service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.getById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }
}
