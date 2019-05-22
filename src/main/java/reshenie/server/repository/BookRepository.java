package reshenie.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reshenie.server.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
