package pl.books.lab.books.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Pawcio on 2017-07-08.
 */
@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    public Publisher() {

    }



    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publisher(String name) {
        this.name = name;
    }
}
