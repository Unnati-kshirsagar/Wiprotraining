package com.wipro.bookmanager.repository;

import com.wipro.bookmanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
