package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.AdminLogin;

public interface AdminLoginRepository extends JpaRepository<AdminLogin,Integer>{

	AdminLogin findByLoginName(String loginName);

}
