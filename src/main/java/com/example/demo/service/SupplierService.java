package com.example.demo.service;

import com.example.demo.entity.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierService {
    List<Supplier> findAll();
    Optional<Supplier> findById(int id);
    void save(Supplier supplier);
    Supplier update(Supplier supplier);
    void delete(int id);
    List<Supplier> findByName(String name);
    Optional<Supplier> findBySelectedName(String name);
}
