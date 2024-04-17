package Esercizio.S7L3.es2;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Section extends CompositeElement {
    private List<CompositeElement> elements;

    public Section() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(CompositeElement element) {
        elements.add(element);
    }

    @Override
    public void remove(CompositeElement element) {
        elements.remove(element);
    }

    @Override
    public int getTotalPages() {
        int totalPages = 0;
        for (CompositeElement element : elements) {
            totalPages += element.getTotalPages();
        }
        return totalPages;
    }

    @Override
    public void print() {
        for (CompositeElement element : elements) {
            element.print();
        }
    }
}
