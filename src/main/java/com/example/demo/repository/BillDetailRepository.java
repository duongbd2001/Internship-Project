package com.example.demo.repository;

import com.example.demo.entity.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Integer>, JpaSpecificationExecutor<BillDetail> {
}