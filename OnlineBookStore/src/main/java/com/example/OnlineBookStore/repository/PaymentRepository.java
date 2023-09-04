package com.example.OnlineBookStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

	

}
