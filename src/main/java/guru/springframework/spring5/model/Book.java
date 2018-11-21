package guru.springframework.spring5.model;

import java.util.HashSet;
import java.util.Set;

public class Book {

    private String title;
    private String isbn;
    private String publisher;

    private Set<Author> authors = new HashSet<>();

    public Book(){

    }

    public Book (String title, String isbn, String publisher){
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book (String title, String isbn, String publisher, Set<Author> authors){
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }



}
