package Esercizio.S7L3.es2;

public abstract class CompositeElement {
    public abstract void add(CompositeElement element);
    public abstract void remove(CompositeElement element);
    public abstract int getTotalPages();
    public abstract void print();
}
