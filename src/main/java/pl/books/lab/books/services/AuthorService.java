package pl.books.lab.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.books.lab.books.model.Author;
import pl.books.lab.books.repositories.AuthorRepository;

import java.util.List;

/**
 * Created by Pawcio on 2017-07-20.
 */
@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }


}
