package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.Authors;


public interface AuthorsRepository extends JpaRepository<Authors,Integer>{

}
