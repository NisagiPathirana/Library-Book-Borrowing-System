package edu.icet.service;

import edu.icet.model.dto.Book;
import edu.icet.model.entity.BookEntity;
import edu.icet.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void getAllDetails(){

       List<BookEntity> bookEntityList = bookRepository.findAll();

       List<Book> bookList = new ArrayList<>();
        for(BookEntity bookEntity : bookEntityList){
            bookList.add(new Book(
                    bookEntity.getId(),
                    bookEntity.getTitle(),
                    bookEntity.getAuthor(),
                    bookEntity.getPublisher(),
                    bookEntity.getIsbn(),
                    bookEntity.getCategory(),
                    bookEntity.getAvailableCopies()

            ));
        }

    }

    public void add(Book book){

        BookEntity BookEntity = new BookEntity(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getIsbn(),
                book.getCategory(),
                book.getAvailableCopies()
        );

        bookRepository.save(BookEntity);

    }

}
