package entity;
import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "id_customer")
    private int idCustomer;

    @Column(name = "name_cust")
    private String nameCust;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    public int getIdCustomer() {
        return this.idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCust() {
        return this.nameCust;
    }

    public void setNameCust(String nameCust) {
        this.nameCust = nameCust;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
