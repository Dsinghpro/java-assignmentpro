package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.AdminLogin;
import com.example.OnlineBookStore.repository.AdminLoginRepository;

@Service
public class AdminLoginService {

    @Autowired
    private AdminLoginRepository adminLoginRepository;
    
    @Autowired
   	RestTemplate restTemplate;

    @Transactional
    public boolean authenticateAdmin(String loginName, String password) {
        AdminLogin adminLogin = adminLoginRepository.findByLoginName(loginName);
        if (adminLogin != null && adminLogin.getPassword().equals(password)) {
            return true; // Authentication successful
        }
        return false; // Authentication failed
    }
}
