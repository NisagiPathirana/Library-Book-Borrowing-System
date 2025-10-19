package edu.icet.controller;

import edu.icet.model.dto.Book;
import edu.icet.model.entity.BookEntity;
import edu.icet.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")//@Controller @ResponseBody

public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public void add(@RequestBody Book book) {
        //System.out.println(book);

        bookService.add(book);
    }

    @GetMapping("{author}")
    public String getAuthor(@PathVariable String author) {
        return author;
    }

    @GetMapping ("/all")
    public void getAll() {
        bookService.getAllDetails();
    }

    @GetMapping ("/{id}")
    public void searchById(@PathVariable String id){
        bookService.searchById(Integer.parseInt(id));

    }

}
