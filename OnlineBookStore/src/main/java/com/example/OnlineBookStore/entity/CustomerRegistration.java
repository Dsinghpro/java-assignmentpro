package com.example.OnlineBookStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer_Registration")
public class CustomerRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_registration_id")
    private int customerRegistrationId;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", unique = true, length = 50)
    private String email;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @Column(name = "user_id", nullable = false, length = 10)
    private String userId;

    @Column(name = "mobileNo", unique = true, length = 12)
    private String mobileNo;

    @Column(name = "password", nullable = false, length = 8)
    private String password;

    public CustomerRegistration() {
        // Default constructor
    }

    // Getters and setters for all fields

    public int getCustomerRegistrationId() {
        return customerRegistrationId;
    }

    public void setCustomerRegistrationId(int customerRegistrationId) {
        this.customerRegistrationId = customerRegistrationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
