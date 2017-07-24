package pl.books.lab.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.books.lab.books.model.Reviewer;

import java.util.List;

/**
 * Created by Pawcio on 2017-07-23.
 */
@Repository
public interface ReviewerRepository extends JpaRepository<Reviewer,Long>{
public Reviewer findByLastName(String lastName);
}
