package service.impl;

import entity.BillDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BillDetailRepository;
import service.BillDetailService;

import java.util.List;

@Service
public class BillDetailServiceImpl implements BillDetailService {
    @Autowired
    private BillDetailRepository billDetailRepository;

    @Override
    public List<BillDetail> getAll() {
        return billDetailRepository.findAll();
    }

    @Override
    public BillDetail getById(int id) {
        return billDetailRepository.getById(id);
    }

    @Override
    public void create(BillDetail billDetail) {
        billDetailRepository.save(billDetail);
    }

    @Override
    public void update(BillDetail billDetail) {
        billDetailRepository.save(billDetail);
    }

    @Override
    public void deleteById(int id) {
        billDetailRepository.deleteById(id);
    }
}
