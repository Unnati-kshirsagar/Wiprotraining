package com.wipro.bookmanager.service.impl;

import com.wipro.bookmanager.entity.Book;
import com.wipro.bookmanager.repository.BookRepository;
import com.wipro.bookmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepo;

    @Override
    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        return bookRepo.findById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());
            return bookRepo.save(book);
        }).orElse(null);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}
