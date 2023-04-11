package com.learning.relationships.controllers;

import com.learning.relationships.entities.Book;
import com.learning.relationships.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookCon {
    private final BookRepository bookRepository;
    @GetMapping
    List<Book> all(){
        return bookRepository.findAll();
    }
    @GetMapping("/{id}")
    Optional<Book> single(@PathVariable Long id){
        return bookRepository.findById(id);
    }
    @PostMapping
    Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }
    @PutMapping
    Book update(@RequestBody Book book){
        return bookRepository.save(book);
    }
    @DeleteMapping("/{id}")
    void remove(@PathVariable Long id){
        bookRepository.deleteById(id);
    }
}
