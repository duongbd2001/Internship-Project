package com.example.demo.service.impl;

import com.example.demo.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.BillRepository;
import com.example.demo.service.BillService;

import java.util.List;
import java.util.Optional;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public List<Bill> getAll() {
        return billRepository.findAll();
    }

    @Override
    public Optional<Bill> getOne(int id) {
        return billRepository.findById(id);
    }

    @Override
    public void create(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void deleteById(int id) {
        billRepository.deleteById(id);
    }

    @Override
    public void update(Bill bill) {
        billRepository.save(bill);
    }
}
