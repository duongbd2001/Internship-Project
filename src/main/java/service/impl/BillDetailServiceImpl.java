package service.impl;

import entity.BillDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BillDetailRepository;
import service.BillDetailService;

import java.util.List;
import java.util.Optional;

@Service
public class BillDetailServiceImpl implements BillDetailService {
    @Autowired
    private BillDetailRepository billDetailRepository;

    @Override
    public List<BillDetail> getAll() {
        return billDetailRepository.findAll();
    }

    @Override
    public Optional<BillDetail> getById(int id) {
        return billDetailRepository.findById(id);
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
