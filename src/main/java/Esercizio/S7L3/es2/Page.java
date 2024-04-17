package Esercizio.S7L3.es2;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Page extends CompositeElement {
    private int pageNumber;

    @Override
    public void add(CompositeElement element) {
        throw new UnsupportedOperationException("Cannot add elements to a page.");
    }

    @Override
    public void remove(CompositeElement element) {
        throw new UnsupportedOperationException("Cannot remove elements from a page.");
    }

    @Override
    public int getTotalPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Page " + pageNumber);
    }
}
