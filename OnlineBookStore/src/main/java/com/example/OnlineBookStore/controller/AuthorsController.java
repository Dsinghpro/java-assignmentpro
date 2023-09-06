package com.example.OnlineBookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.OnlineBookStore.entity.Authors;
import com.example.OnlineBookStore.repository.AuthorsRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

    private AuthorsRepository authorRepository;

    @Autowired
    public AuthorsController(AuthorsRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/all")
    public List<Authors> getAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/{author_id}")
    public Optional<Authors> getAuthorById(@PathVariable int author_id) {
        return authorRepository.findById(author_id);
    }

    @PostMapping("/insert")
    public Authors createAuthor(@RequestBody Authors author) {
        return authorRepository.save(author);
    }

//    @PutMapping("/{id}")
//    public Authors updateAuthor(@PathVariable Long id, @RequestBody Authors author) {
//        author.setId(id); // Ensure the ID matches the path variable
//        return authorRepository.save(author);
//    }

    @DeleteMapping("/{author_id}")
    public void deleteAuthor(@PathVariable int author_id) {
        authorRepository.deleteById(author_id);
    }
}
