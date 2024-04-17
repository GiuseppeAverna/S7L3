package Esercizio.S7L3.es2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private List<Author> authors;
    private double price;
    private CompositeElement contents;

    public int getTotalPages() {
        return contents.getTotalPages();
    }

    public void print() {
        System.out.println("Book: ");
        contents.print();
    }
}
