package pl.books.lab.books.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.books.lab.books.model.Book;

/**
 * Created by Pawcio on 2017-07-08.
 */
@Repository
public interface BookRepository  extends PagingAndSortingRepository<Book, Long> {
    public Book findByTitle(String title);
    public Book findByIsbn(String isbn);

    Page<Book> findAll(Pageable pageable);
}
