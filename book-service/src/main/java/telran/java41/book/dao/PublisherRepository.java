package telran.java41.book.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java41.book.model.Book;
import telran.java41.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {

	Stream<Book> findByPublisherName(String name);
	
	Stream<Book> findByPublisherByAuthor(String authorName);
}
