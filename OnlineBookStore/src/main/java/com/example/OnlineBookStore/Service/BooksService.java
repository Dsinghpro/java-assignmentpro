package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.Books;
import com.example.OnlineBookStore.repository.BooksRepository;

import java.util.List;

@Service
public class  BooksService {

    @Autowired
    private BooksRepository booksRepository;
    
    @Autowired
   	RestTemplate restTemplate;
    
    @Transactional
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

   
    @Transactional
    public Books getBook(int bookId) {
        return booksRepository.findById(bookId).orElse(null);
    }

    
    @Transactional
    public void saveBook(Books book) {
        booksRepository.save(book);
    }

    
    @Transactional
    public void deleteBook(int bookId) {
        booksRepository.deleteById(bookId);
    }
}

