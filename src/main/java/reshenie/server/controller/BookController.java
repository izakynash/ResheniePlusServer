package reshenie.server.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import reshenie.server.entity.Book;
import reshenie.server.repository.BookRepository;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // контроллер должен знать, к какому методу обращаться и каким http методом:
    @RequestMapping (value = "/get", method = RequestMethod.GET)
    // объект ModelMap позволит передать что-либо клиенту в респонс
    // @ResponseBody - в виде респонса хотим вернуть строку
    public @ResponseBody
    Book getBook () {
        List<Book> list = bookRepository.findAll();
        return createMockBook();
    }

    public Book createMockBook() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("boooook");
        book.setDescription("good book");

//        Gson gson = new Gson();
//        return gson.toJson(book);

        return book;
    }
}
