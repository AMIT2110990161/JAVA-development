package Generics;

public class GenericClass<T extends Number> { // bound type parameter
    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

}
