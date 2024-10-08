package com.demo.books.controller;

import com.demo.books.entity.BookEntity;
import com.demo.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<BookEntity> getAllBooks(){
        return bookService.getAllBook();
    }

    @PostMapping("/book")
    public  BookEntity addBook(@RequestBody BookEntity bookEntity){
        return bookService.addBook(bookEntity);
    }
}
