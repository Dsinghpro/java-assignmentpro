package com.example.OnlineBookStore.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.OnlineBookStore.entity.Books;
import com.example.OnlineBookStore.repository.BooksRepository;


@Transactional(readOnly = true)
@RestController
@RequestMapping("/book")
public class BooksController {
	
	
	 private final BooksRepository bookRepository;

	    @Autowired
	    public BooksController(BooksRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    
	    @GetMapping("/all")
	    public List<Books> getAllBooks() {
	    	return bookRepository.findAll();
	    }
	    
	    @Transactional(readOnly=true)
	    	@GetMapping(value="/{title}",produces="application/json")
	    	public ResponseEntity<List<Books>> searchbookbytitle(@PathVariable String title){
	    		List<Books> b=bookRepository.searchBooksByTitle(title);
	    		if(b!=null)
	    			return new ResponseEntity<List<Books>>(b,HttpStatus.OK);
	    		return new ResponseEntity<List<Books>>(b,HttpStatus.NOT_FOUND);
	    }


	    @GetMapping("/{author_id}")
	    public ResponseEntity<Books> getBookByauthorid(@PathVariable int author_id) {
	    	 Optional<Books> optionalBook = bookRepository.findBooksByAuthorId(author_id);

	        if (optionalBook.isPresent()) {
	            Books book = optionalBook.get();
	            return ResponseEntity.ok(book);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    @PostMapping("/insert")
	    public Books createBook(@RequestBody Books book) {
	        return bookRepository.save(book);
	    }
	    
//	    @Transactional(readOnly=true)
//	    @GetMapping("/search/{author_name}")
//	    public ResponseEntity<List<Books>> searchBooksByAuthorName(@PathVariable String author_name) {
//	    	List<Books> b2=bookRepository.searchBooksByAuthorName(author_name);
//	    	if(b2!=null)
//	    		return new ResponseEntity<List<Books>>(b2,HttpStatus.OK);
//    		return new ResponseEntity<List<Books>>(b2,HttpStatus.NOT_FOUND);
//	    		
//	    }
	    
//	    @Transactional(readOnly=true)
//	    @GetMapping("/search/{author_name}")
//	    public List<Books> searchBooksByAuthorName(@PathVariable String author_name) {
//	        return bookRepository.searchBooksByAuthorName(author_name);
//	    }
//	    
	 
	    
	      
}
