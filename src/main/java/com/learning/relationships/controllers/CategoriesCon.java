package com.learning.relationships.controllers;

import com.learning.relationships.entities.Book;
import com.learning.relationships.entities.Category;
import com.learning.relationships.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoriesCon {
    private final CategoryRepository categoryRepository;
    @GetMapping
    List<Category> all(){
        return categoryRepository.findAll();
    }
    @GetMapping("/{id}")
    Optional<Category> single(@PathVariable Long id){
        return categoryRepository.findById(id);
    }
    @PostMapping
    Category saveCat(@RequestBody Category cat){
        return categoryRepository.save(cat);
    }
    @PutMapping
    Category update(@RequestBody Category cat){
        return categoryRepository.save(cat);
    }
    @DeleteMapping("/{id}")
    void remove(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }
}
