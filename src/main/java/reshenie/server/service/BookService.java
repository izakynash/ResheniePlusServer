package reshenie.server.service;

import reshenie.server.entity.Book;
import reshenie.server.entity.Category;

import java.util.List;

// сервисный слой, предоставляет возможность работы с логикой приложения
// Репозитори работает с полученым данных из БД, некруто исп его для другого
//
public interface BookService {

    List<Book> getAllBook();
    Book getById (long id);
    Book save(Book book);
    void remove (long id);
}
