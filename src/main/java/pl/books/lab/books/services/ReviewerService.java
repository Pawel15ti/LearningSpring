package pl.books.lab.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.books.lab.books.model.Reviewer;
import pl.books.lab.books.repositories.ReviewerRepository;

import java.util.List;

/**
 * Created by Pawcio on 2017-07-23.
 */
@Service
public class ReviewerService {
    @Autowired
    public ReviewerRepository reviewerRepository;
    public List<Reviewer> getReviewers(){
        return reviewerRepository.findAll();
    }
}
