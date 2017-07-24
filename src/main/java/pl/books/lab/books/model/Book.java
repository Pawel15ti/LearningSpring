package pl.books.lab.books.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pawcio on 2017-07-08.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String title;
    private String isbn;
    private String description;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JsonManagedReference
    private Author author;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Publisher publisher;
    @ManyToMany(cascade = {CascadeType.MERGE})
    private List<Reviewer> reviewers;

    public Book(){

    }

    public Book(String title, String isbn, String description, Author author, Publisher publisher, List<Reviewer> reviewers) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.reviewers = reviewers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
