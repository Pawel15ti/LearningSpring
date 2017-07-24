package pl.books.lab.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.books.lab.books.model.Author;
import pl.books.lab.books.model.Book;
import pl.books.lab.books.model.Publisher;
import pl.books.lab.books.model.Reviewer;
import pl.books.lab.books.repositories.BookRepository;
import org.springframework.http.MediaType;
import pl.books.lab.books.services.AuthorService;
import pl.books.lab.books.services.BookService;
import pl.books.lab.books.services.PublisherService;
import pl.books.lab.books.services.ReviewerService;

import java.util.Collection;
import java.util.List;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Pawcio on 2017-07-10.
 */

@RestController
@RequestMapping("/books")
public class RESTController {

    private static List<Book> book = new ArrayList<>();
    private static List<Author> author = new ArrayList<>();
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private ReviewerService reviewerService;
    @Autowired
    private PublisherService publisherService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Page<Book> readBookmarks(Pageable pageable) {
        System.out.println("Liczba ksiazek: " + bookRepository.count());
        return bookService.getBooks(pageable);
    }

    @RequestMapping(path = "/authors", method = RequestMethod.GET)
    public @ResponseBody
    List<Author> readAuthors() {
        return authorService.getAuthors();
    }

    @RequestMapping(path = "/reviewers", method = RequestMethod.GET)
    public @ResponseBody
    List<Reviewer> readReviewers() {
        return reviewerService.getReviewers();
    }

    @RequestMapping(path = "/publishers", method = RequestMethod.GET)
    public @ResponseBody
    List<Publisher> readPublishers() {
        return publisherService.getPublishers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{isbn}")
    public @ResponseBody
    Book findIsbn(@PathVariable String isbn) {
        return bookService.getbookByIsbn(isbn);
    }
}
