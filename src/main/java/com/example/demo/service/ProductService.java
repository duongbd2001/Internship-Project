package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(int id);
    void save(Product product);
    Product update(Product product);
    void delete(int id);
    void multiDelete(List<Product> products);
}
