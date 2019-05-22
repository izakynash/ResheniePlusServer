package reshenie.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reshenie.server.entity.Book;
import reshenie.server.repository.BookRepository;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    // здесь можно подкл репозитории, другие сервисы, здесь вс бизнес-логика
    // а контроллеры их просто вызывают

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getById(long id) {
        return bookRepository.findOne(id);
    }

    public Book save(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    public void remove(long id) {
        bookRepository.delete(id);
    }
}
