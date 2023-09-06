package com.example.OnlineBookStore.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import com.example.OnlineBookStore.entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication,Integer>{
	 @Procedure(procedureName = "insertpublication")
	 void insertpublication(
			 @Param("p_PublicationName") String publicationName,
		      @Param("p_Address") String address,
		      @Param("p_Email") String email,
		      @Param("p_createdAt") Date createdAt
			 );
}
