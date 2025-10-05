package edu.icet.controller;

import edu.icet.model.Book;
import edu.icet.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController     //@Controller @ResponseBody

public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public void add(@RequestBody Book book) {
        //System.out.println(book);

        bookService.add(book);
    }




}
