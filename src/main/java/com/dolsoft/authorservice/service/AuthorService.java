package com.dolsoft.authorservice.service;

import com.dolsoft.authorservice.model.Author;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class AuthorService {

    public Author getAuthor(String authorId) {
        Author author = new Author();
        author.setId(new Random().nextInt(1000));
        author.setName("John Doe");
        author.setRegistrationDate("2026-10-20");
        author.setEmail("john.doe@example.com");
        return author;
    }

    public String createAuthor(Author author) {
        if (author != null) {
            return String.format("Author created: %s", author.toString());
        }
        return null;
    }

    public String deleteAuthor(String authorId) {
        return String.format("Author deleted with id %s", authorId);
    }
}