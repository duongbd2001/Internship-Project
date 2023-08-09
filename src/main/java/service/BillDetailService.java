package service;

import entity.BillDetail;

import java.util.List;

public interface BillDetailService {
    List<BillDetail> getAll();
    BillDetail getById(int id);
    void create(BillDetail billDetail);
    void update(BillDetail billDetail);
    void deleteById(int id);
}