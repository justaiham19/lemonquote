package com.aiham.lemonquote.repository;

import com.aiham.lemonquote.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository<Book,Integer> {
     Book findByIsbn(Integer isbn);

}
