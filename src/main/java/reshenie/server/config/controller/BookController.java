package reshenie.server.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {

    // контроллер должен знать, к какому методу обращаться и каким http методом:
    @RequestMapping (value = "/get", method = RequestMethod.GET)
    // объект ModelMap позволит передать что-либо клиенту в респонс
    // @ResponseBody - в виде респонса хотим вернуть строку
    public @ResponseBody String getBook (ModelMap model) {
        return "My Book";
    }
}
