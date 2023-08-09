package dto;

import entity.Supplier;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer idProduct;
    private String name;
    private Integer cost;
    private Integer quantity;
    private Supplier idSupplier;
}
