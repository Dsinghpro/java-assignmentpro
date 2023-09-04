package com.example.OnlineBookStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem,Integer>{

	
	

}
