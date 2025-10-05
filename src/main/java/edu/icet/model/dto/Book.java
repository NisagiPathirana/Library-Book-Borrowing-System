package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Book {
    private long Id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String category;
    private int availableCopies;
}
