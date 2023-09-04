package com.example.OnlineBookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.OnlineBookStore.Service.AuthorsService;
import com.example.OnlineBookStore.entity.Authors;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorsController {

    @Autowired
    private AuthorsService authorService;

    // Mapping to list all authors
    @GetMapping("/list")
    public ResponseEntity<List<Authors>> getAllAuthors() {
        List<Authors> alist = authorService.getAllAuthors();
        if(alist.size()!=0)
        	return new ResponseEntity<List<Authors>>(alist,HttpStatus.OK);
		return new ResponseEntity<List<Authors>>(alist,HttpStatus.NOT_FOUND);
    }

    // Mapping to show author details
    @GetMapping("/show/{authorId}")
    public ResponseEntity<Authors> getByauthorId(@PathVariable int authorId) {
        Authors a = authorService.getAuthor(authorId);
        if(a!=null)
        	return new ResponseEntity<Authors>(a,HttpStatus.OK);
		return new ResponseEntity<Authors>(a,HttpStatus.NOT_FOUND);
        	
    }

    // Mapping to show the author form for adding a new author
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Authors author = new Authors();
        model.addAttribute("author", author);
        return "author/author-form";
    }

    // Mapping to process the form data and save a new author
    @PostMapping("/saveAuthor")
    public String saveAuthor(@ModelAttribute("author") Authors author) {
        authorService.saveAuthor(author);
        return "redirect:/authors/list";
    }

    // Mapping to show the author form for updating an existing author
    @GetMapping("/showFormForUpdate/{authorId}")
    public String showFormForUpdate(@PathVariable int authorId, Model model) {
        Authors author = authorService.getAuthor(authorId);
        model.addAttribute("author", author);
        return "author/author-form";
    }

    // Mapping to delete an author
    @GetMapping("/delete/{authorId}")
    public String deleteAuthor(@PathVariable int authorId) {
        authorService.deleteAuthor(authorId);
        return "redirect:/authors/list";
    }
}
