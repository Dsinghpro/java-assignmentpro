package com.example.OnlineBookStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.OnlineBookStore.entity.Publication;
import com.example.OnlineBookStore.repository.PublicationRepository;

@RestController
@RequestMapping("/publication")
public class PublicationController {
	
	private PublicationRepository publicationRepository;
	
	@Autowired
	
	public PublicationController(PublicationRepository publicationRepository) {
		this.publicationRepository=publicationRepository;
	}
	
	@GetMapping("/all")
    public List<Publication> getAllPublication() {
        return publicationRepository.findAll();
    }
	
	@GetMapping("/{publication_id}")
    public Optional<Publication> getPublicationById(@PathVariable int publication_id) {
        return publicationRepository.findById(publication_id);
    }
	
	 @PostMapping("/insert")
	    public Publication insertPublication(@RequestBody Publication publication) {
	        return publicationRepository.save(publication);
	    }
	 
	 
	 @DeleteMapping("/{publication_id}")
	    public void deletePublication(@PathVariable int publication_id) {
		 	publicationRepository.deleteById(publication_id);
	    }

}
