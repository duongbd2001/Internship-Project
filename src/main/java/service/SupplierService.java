package service;

import entity.Product;
import entity.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> findAll();
    Supplier findById(int id);
    void save(Supplier supplier);
    Supplier update(Supplier supplier);
    void delete(int id);
}
