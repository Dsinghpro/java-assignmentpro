package com.example.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.OnlineBookStore.entity.Publication;
import com.example.OnlineBookStore.repository.PublicationRepository;

import java.util.List;

@Service
public class  PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;
    
    @Autowired
	RestTemplate restTemplate;
    
    @Transactional
    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

   
    @Transactional
    public Publication getPublication(int publicationId) {
        return publicationRepository.findById(publicationId).orElse(null);
    }

   
    @Transactional
    public void savePublication(Publication publication) {
        publicationRepository.save(publication);
    }

    
    @Transactional
    public void deletePublication(int publicationId) {
        publicationRepository.deleteById(publicationId);
    }
}

