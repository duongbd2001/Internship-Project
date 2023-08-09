package service.impl;

import entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SupplierRepository;
import service.SupplierService;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findById(int id) {
        return supplierRepository.getById(id);
    }

    @Override
    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public Supplier update(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public void delete(int id) {
        supplierRepository.deleteById(id);
    }
}
