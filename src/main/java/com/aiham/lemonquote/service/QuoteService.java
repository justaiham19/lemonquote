package com.aiham.lemonquote.service;

import com.aiham.lemonquote.model.Book;
import com.aiham.lemonquote.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    private final BookRepository bookRepository;
    @Autowired
    public QuoteService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
