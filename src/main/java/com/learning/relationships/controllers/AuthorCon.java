package com.learning.relationships.controllers;

import com.learning.relationships.entities.Author;
import com.learning.relationships.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/author")
public class AuthorCon {
    private final AuthorRepository authorRepository;
    @GetMapping
    List<Author> all(){
        return authorRepository.findAll();
    }
    @GetMapping("/{id}")
    Optional<Author> single(@PathVariable Long id){
        return authorRepository.findById(id);
    }
    @PostMapping
    Author saveAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }
    @PutMapping
    Author update(@RequestBody Author author){
        return authorRepository.save(author);
    }
    @DeleteMapping("/{id}")
    void remove(@PathVariable Long id){
        authorRepository.deleteById(id);
    }
}
