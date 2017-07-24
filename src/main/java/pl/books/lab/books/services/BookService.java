package pl.books.lab.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.books.lab.books.model.Book;
import pl.books.lab.books.repositories.BookRepository;

import java.util.List;

/**
 * Created by Pawcio on 2017-07-20.
 */

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public Page<Book> getBooks(Pageable pageable){
        return bookRepository.findAll(pageable);
    }

    public Book getbookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

}
