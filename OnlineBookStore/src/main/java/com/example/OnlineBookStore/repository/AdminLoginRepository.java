package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.OnlineBookStore.entity.AdminLogin;

public interface AdminLoginRepository extends JpaRepository<AdminLogin,Integer>{

	@Procedure(procedureName = "insertadmin_login")
    void insertAdminLogin(
        @Param("p_login_name") String loginName,
        @Param("p_password") String password
    );

}
