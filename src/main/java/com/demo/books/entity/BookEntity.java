package com.demo.books.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="book_entity")
public class BookEntity {
    @Id
    @Column(name = "book_id")
    Long bookId;
    @Column(name = "book_name")
    String bookName;
}
