package service;

import entity.Bill;

import java.util.List;
import java.util.Optional;

public interface BillService {
    List<Bill> getAll();
    Bill getOne(int id);
    void create(Bill bill);
    void deleteById(int id);
    void update(Bill bill);
}