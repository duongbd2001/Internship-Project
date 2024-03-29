package com.example.demo.repository;

import com.example.demo.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
    @Query(value = "SELECT s.nameSupplier, s.address, s.email, s.phoneNumber FROM Supplier AS s WHERE s.nameSupplier like '%:name%'")
    List<Supplier> findByName(@Param("name") String name);
}
