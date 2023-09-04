package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.CustomerRegistration;

public interface CustomerRegistrationRepository extends JpaRepository<CustomerRegistration,Integer>{

	CustomerRegistration findByUserId(String userId);

}
