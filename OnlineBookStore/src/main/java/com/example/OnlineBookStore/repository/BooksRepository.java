package com.example.OnlineBookStore.repository;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.OnlineBookStore.entity.Authors;
import com.example.OnlineBookStore.entity.Books;

public interface BooksRepository extends JpaRepository<Books,Integer>{

	
	@Query(nativeQuery = true,name = "select * from books where title=:searchTitle")
    List<Books> searchBooksByTitle(@Param("searchTitle") String searchTitle);
	
	@Query(value = "SELECT * FROM Books WHERE author_id = :authorId", nativeQuery = true)
    Optional<Books> findBooksByAuthorId(@Param("authorId") int authorId);
	
//	 @Procedure("SearchBooksByAuthorName")
//	    List<Books> searchBooksByAuthorName(@Param("searchAuthorName") String searchAuthorName);
	
//	 @Query(nativeQuery = true,value = "select books.*,authors.* from books\r\n"
//	 		+ "join authors on authors.author_id = books.author_id where authors.author_name like %:authorName% ")
//	    List<Books> searchBooksByAuthorName(String authorName);
	
	 @Procedure(name = "InsertBook")
	    void InsertBook(
	        @Param("p_AuthorId") int authorId,
	        @Param("p_PublicationId") int publicationId,
	        @Param("p_Title") String title,
	        @Param("p_ISBN") String isbn,
	        @Param("p_Category") String category,
	        @Param("p_publicationYear") int publicationYear,
	        @Param("p_price") float price,
	        @Param("p_quantity") int quantity
	    );
	

	
	
	}


