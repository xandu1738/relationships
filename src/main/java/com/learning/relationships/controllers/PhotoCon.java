package com.learning.relationships.controllers;

import com.learning.relationships.entities.Photo;
import com.learning.relationships.repositories.PhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/photo")
public class PhotoCon {
    private final PhotoRepository photoRepository;
    @GetMapping
    List<Photo> all(){
        return photoRepository.findAll();
    }
    @GetMapping("/{id}")
    Optional<Photo> one(@PathVariable Long id){
        return photoRepository.findById(id);
    }
    @PostMapping
    Photo addPic(@RequestBody Photo photo){
        return photoRepository.save(photo);
    }
    @PutMapping
    Photo update(@RequestBody Photo photo){
        return photoRepository.save(photo);
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id){
        photoRepository.deleteById(id);
    }
}
