package com.ahmedab.bookstore.controller;


import com.ahmedab.bookstore.dto.BookDto;
import com.ahmedab.bookstore.repository.IBookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class BookController {


    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks(){
        var books = List.of(BookDto.builder().title("My First Book").build());
        return ResponseEntity.ok(books);
    }

}
