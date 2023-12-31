package com.ahmedab.bookstore.repository;

import com.ahmedab.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
