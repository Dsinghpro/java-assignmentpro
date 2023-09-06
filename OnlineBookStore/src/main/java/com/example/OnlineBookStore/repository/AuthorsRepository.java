package com.example.OnlineBookStore.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.OnlineBookStore.entity.Authors;


public interface AuthorsRepository extends JpaRepository<Authors,Integer>{
	  @Procedure(procedureName = "insertauthor")
	    void insertAuthor(
	        @Param("p_AuthorName") String authorName,
	        @Param("p_nationality") String nationality,
	        @Param("p_Birth_Date") Date birthDate
	    );
}
