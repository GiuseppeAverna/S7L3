package Esercizio.S7L3.es2;

import java.util.ArrayList;
import java.util.List;
public class Runner {
    public static void main(String[] args) {

        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Smith");


        Section section1 = new Section();
        section1.add(new Page(1));
        section1.add(new Page(2));


        Section section2 = new Section();
        section2.add(new Page(3));

        List<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);

        Book book = new Book(authors, 19.99, section1);
        book.getContents().add(section2);

        System.out.println("Book Contents:");
        book.print();


        System.out.println("Total Pages: " + book.getTotalPages());


        System.out.println("Price: $" + book.getPrice());
    }
}
