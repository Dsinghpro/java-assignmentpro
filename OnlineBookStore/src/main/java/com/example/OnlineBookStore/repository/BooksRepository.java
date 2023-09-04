package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.Books;

public interface BooksRepository extends JpaRepository<Books,Integer>{

}
