package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,Integer>{

}
