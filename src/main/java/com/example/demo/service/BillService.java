package com.example.demo.service;

import com.example.demo.entity.Bill;

import java.util.List;
import java.util.Optional;

public interface BillService {
    List<Bill> getAll();
    Optional<Bill> getOne(int id);
    void create(Bill bill);
    void deleteById(int id);
    void update(Bill bill);
}