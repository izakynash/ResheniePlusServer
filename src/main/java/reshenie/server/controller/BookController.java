package reshenie.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reshenie.server.entity.Book;
import reshenie.server.service.BookService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping (value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Book> getAllBooks () {
        return service.getAll();
    }

    @RequestMapping (value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Book getBook (@PathVariable long id) {
        return service.getById(id);
    }

    @RequestMapping (value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Book saveBook (@RequestBody Book book) {
        return service.save(book);
    }

    @RequestMapping (value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete (@PathVariable long id) {
        service.remove(id);
    }



//    public Book createMockBook() {
//        Book book = new Book();
//        book.setId(1);
//        book.setTitle("boooook");
//        book.setDescription("good book");

//        Gson gson = new Gson();
//        return gson.toJson(book);

//        return book;
    }

