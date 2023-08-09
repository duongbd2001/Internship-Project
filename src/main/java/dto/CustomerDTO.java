package dto;

public class CustomerDTO {
    private Integer idCustomer;
    private String nameCust;
    private String phoneNumber;
    private String email;
    private String address;

    public Integer getIdCustomer() {
        return this.idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
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
