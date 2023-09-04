package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
