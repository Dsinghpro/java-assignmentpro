package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.Authors;
import com.example.OnlineBookStore.repository.AuthorsRepository;

import java.util.List;

@Service
public class AuthorsService {

    @Autowired
    private AuthorsRepository authorRepository;
    
    @Autowired
	RestTemplate restTemplate;
    
    
    @Transactional
    public List<Authors> getAllAuthors() {
        return authorRepository.findAll();
    }

   
    @Transactional
    public Authors getAuthor(int authorId) {
        return authorRepository.findById(authorId).orElse(null);
    }

    
    @Transactional
    public void saveAuthor(Authors author) {
        authorRepository.save(author);
    }

    
    @Transactional
    public void deleteAuthor(int authorId) {
        authorRepository.deleteById(authorId);
    }
}

