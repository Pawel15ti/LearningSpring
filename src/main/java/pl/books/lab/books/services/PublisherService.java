package pl.books.lab.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.books.lab.books.model.Publisher;
import pl.books.lab.books.repositories.PublisherRepository;

import java.util.List;

/**
 * Created by Pawcio on 2017-07-23.
 */
@Service
public class PublisherService {
    @Autowired
    public PublisherRepository publisherRepository;
    public List<Publisher> getPublishers(){
        return publisherRepository.findAll();
    }

}
