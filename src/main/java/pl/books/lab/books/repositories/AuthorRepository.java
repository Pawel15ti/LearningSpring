package pl.books.lab.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.books.lab.books.model.Author;

/**
 * Created by Pawcio on 2017-07-23.
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
    public Author findByLastName(String lastName);

}
