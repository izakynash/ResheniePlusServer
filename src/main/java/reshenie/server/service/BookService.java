package reshenie.server.service;

import reshenie.server.entity.Book;

import java.util.List;

// сервисный слой, предоставляет возможность работы с логикой приложения
// Репозитори работает с полученым данных из БД, некруто исп его для другого
//
public interface BookService {

    List<Book> getAll();
    Book getById (long id);
    Book save(Book book);
    void remove (long id);
}
