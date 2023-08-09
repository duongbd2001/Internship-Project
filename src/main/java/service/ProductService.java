package service;

import entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    Product update(Product product);
    void delete(int id);
}
