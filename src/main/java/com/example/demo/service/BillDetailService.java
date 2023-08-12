package com.example.demo.service;

import com.example.demo.entity.BillDetail;

import java.util.List;
import java.util.Optional;

public interface BillDetailService {
    List<BillDetail> getAll();
    Optional<BillDetail> getById(int id);
    void create(BillDetail billDetail);
    void update(BillDetail billDetail);
    void deleteById(int id);
}