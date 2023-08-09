package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bill_detail")
public class BillDetail {
    @Id
    @Column(name = "id_bill_detail")
    private Integer idBillDetail;

    @Column(name = "id_bill")
    private Integer idBill;

    @Column(name = "id_product")
    private Integer idProduct;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Integer price;

    @Column(name = "total")
    private Integer total;

    public Integer getIdBillDetail() {
        return this.idBillDetail;
    }

    public void setIdBillDetail(Integer idBillDetail) {
        this.idBillDetail = idBillDetail;
    }

    public Integer getIdBill() {
        return this.idBill;
    }

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public Integer getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
