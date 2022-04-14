package telran.java41.book.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.java41.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {
	
	Stream<Author> findByName(String authorName);
	
	Stream<Author> findByAuthor(Long isbn);

}
