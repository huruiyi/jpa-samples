package com.in28minutes.springboot.learnspringboot.controller;

import com.in28minutes.springboot.learnspringboot.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return List.of(
				new Book(1L, "Mastering Spring 5.2", "Ranga Karanam"));
    }
}