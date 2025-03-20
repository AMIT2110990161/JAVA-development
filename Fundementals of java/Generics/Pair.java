package Generics;

public class Pair <K, V>{
    private K key;
    private V value;

    public Pair(V value, K key) {
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
