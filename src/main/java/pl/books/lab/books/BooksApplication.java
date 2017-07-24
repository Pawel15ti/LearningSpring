package pl.books.lab.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.books.lab.books.model.Author;
import pl.books.lab.books.model.Book;
import pl.books.lab.books.model.Publisher;
import pl.books.lab.books.model.Reviewer;
import pl.books.lab.books.repositories.AuthorRepository;
import pl.books.lab.books.repositories.BookRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner{

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
	@Override
	public void run(String... strings) throws Exception {




//		Author a1= new Author("Jan","Pork");
//		Book b1 = new Book("Tytul", "123124-125", "Opis", new Author("Lukasz", "Kowalski"),
//				new Publisher("pub"), reviewerList);

		for(int i=0;i<15;i++)
		{
			List<Reviewer> reviewerList = new ArrayList<>();

			reviewerList.add(new Reviewer("Jan"+i, "Kowalski"+i));
			reviewerList.add(new Reviewer("Zbyszek"+i, "Dobry"+i));

			Book b = new Book("Tytul"+i, "123124-125"+i, "Opis"+i, new Author("Lukasz", "Kowalski"),
					new Publisher("pub"), reviewerList);
			bookRepository.save(b);


		}

//		authorRepository.save(a1);


	}
}
