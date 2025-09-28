package edu.icet.service;

import edu.icet.model.Book;
import edu.icet.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void getAllDetails(){

        bookRepository.findAll();
    }

    public void add(){
        Book book = new Book(
                3L,
                "Ape Gama",
                "Martin Wickramasinghe",
                "Sarasavi",
                "978-954-32-8575-4",
                "Sinhala Literature",
                12
        );
        bookRepository.save(book);

    }

}
