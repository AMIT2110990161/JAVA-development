package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList li = new ArrayList(); before generics
        // ArrayList<Integer> li = new ArrayList<>(); after generics

        // Generic class
        GenericClass<Integer> gc = new GenericClass<>();
        gc.setVal(2);
        System.out.println(gc.getVal());

        // now we have bounded this with Number so we can't use String here

//        GenericClass<String> gs = new GenericClass<>();
//        gs.setVal("Amit kumar");
//        System.out.println(gs.getVal());

        // Generic Pair class

        Pair<Integer, String> gp = new Pair<>("Amit kumar", 0);
        System.out.println(gp.getKey());
        System.out.println(gp.getValue());

        // Generic in Interface

        GenericContainer<String> g = new GenericContainer<>();
        g.setItem("Food Items");
        System.out.println(g.getItem());



    }
}
