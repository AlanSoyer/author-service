package com.dolsoft.authorservice.controller;

import com.dolsoft.authorservice.model.Author;
import com.dolsoft.authorservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(value = "/{authorId}")
    public ResponseEntity<Author> getAuthor(@PathVariable("authorId") String authorId) {
        return ResponseEntity.ok(authorService.getAuthor(authorId));
    }

    @PostMapping
    public ResponseEntity<String> createAuthor(@RequestBody Author request) {
        return ResponseEntity.ok(authorService.createAuthor(request));
    }

    @DeleteMapping(value = "/{authorId}")
    public ResponseEntity<String> deleteAuthor(@PathVariable("authorId") String authorId) {
        return ResponseEntity.ok(authorService.deleteAuthor(authorId));
    }
}