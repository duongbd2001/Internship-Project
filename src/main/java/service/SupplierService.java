package service;

import entity.Product;
import entity.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierService {
    List<Supplier> findAll();
    Optional<Supplier> findById(int id);
    void save(Supplier supplier);
    Supplier update(Supplier supplier);
    void delete(int id);
}
