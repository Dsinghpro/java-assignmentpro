package com.example.OnlineBookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnlineBookStore.entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication,Integer>{

}
