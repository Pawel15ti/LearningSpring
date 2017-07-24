package pl.books.lab.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.books.lab.books.model.Publisher;

/**
 * Created by Pawcio on 2017-07-23.
 */
@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long>{
    public Publisher findByName(String name);
}
