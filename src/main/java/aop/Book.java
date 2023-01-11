package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("War and Peace")
    private String name;

    @Value("L.N. Tolstoy")
    private String author;

    @Value("1887")
    private int yearOfPublished;
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }
}
