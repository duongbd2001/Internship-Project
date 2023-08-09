package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @Column(name = "id_bill")
    private Integer idBill;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_price")
    private Integer unitPrice;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total_money")
    private Integer totalMoney;

    public Integer getIdBill() {
        return this.idBill;
    }

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalMoney() {
        return this.totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }
}
