package com.example.demo.dto;

import com.example.demo.entity.Supplier;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer idProduct;
    private String name;
    private Integer cost;
    private Integer quantity;
    private Supplier idSupplier;
}
