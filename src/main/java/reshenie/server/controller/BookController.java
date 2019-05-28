package reshenie.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reshenie.server.entity.Book;
import reshenie.server.entity.Category;
import reshenie.server.service.BookService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping (value = "/all_books", method = RequestMethod.GET)
    @ResponseBody
    public List<Book> getAllBooks () {
        return service.getAllBook();
    }

    @RequestMapping (value = "/book/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Book getBook (@PathVariable long id) {
        return service.getById(id);
    }

    @RequestMapping (value = "/book_post", method = RequestMethod.POST)
    @ResponseBody
    public Book saveBook (@RequestBody Book book) {
        return service.save(book);
    }

    @RequestMapping (value = "/book_remove/{id}", method = RequestMethod.DELETE)
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

