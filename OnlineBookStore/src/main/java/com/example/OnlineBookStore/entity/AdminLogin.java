package com.example.OnlineBookStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin_login")
public class AdminLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_login_id")
    private int adminLoginId;

    @Column(name = "login_name", nullable = false, length = 10)
    private String loginName;

    @Column(name = "Password", nullable = false, length = 8)
    private String password;

    public AdminLogin() {
        // Default constructor
    }

    public AdminLogin(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    // Getters and setters for all fields

    public int getAdminLoginId() {
        return adminLoginId;
    }

    public void setAdminLoginId(int adminLoginId) {
        this.adminLoginId = adminLoginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
