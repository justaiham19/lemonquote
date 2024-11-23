package com.aiham.lemonquote.controler;

import com.aiham.lemonquote.model.Book;
import com.aiham.lemonquote.repository.BookRepository;
import com.aiham.lemonquote.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookControler {
    private final BookService bookService;
    @Autowired
    public BookControler(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "/user/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
