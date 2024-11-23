package com.aiham.lemonquote.controler;

import com.aiham.lemonquote.model.Book;
import com.aiham.lemonquote.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class QuoteController {
    private final BookService bookService;
    @Autowired
    public QuoteController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "/book/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
