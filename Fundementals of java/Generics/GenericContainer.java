package Generics;

public class GenericContainer<T> implements Container<T>{
    private T item;
    @Override
    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public T getItem() {
        return item;
    }
}
