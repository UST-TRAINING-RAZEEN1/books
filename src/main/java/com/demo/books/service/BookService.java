package com.demo.books.service;

import com.demo.books.entity.BookEntity;
import com.demo.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

  public List<BookEntity> getAllBook(){
      return bookRepository.findAll();
  }
  public BookEntity addBook(BookEntity bookEntity){
      bookRepository.saveAndFlush(bookEntity);
      return bookEntity;
  }
}
