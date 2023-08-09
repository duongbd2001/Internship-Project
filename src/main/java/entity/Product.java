package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id_product")
    private Integer idProduct;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "quantity")
    private Integer quantity;

    @JoinColumn(name = "id_supplier")
    @ManyToOne
    private Supplier idSupplier;

    public Integer getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return this.cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Supplier getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Supplier idSupplier) {
        this.idSupplier = idSupplier;
    }
}
