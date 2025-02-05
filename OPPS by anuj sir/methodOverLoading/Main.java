package methodOverLoading;

public class Main {
    public static void main(String[] args) {
        Greting g = new Greting();
        g.greet();
        g.greet("Amit kumar");
    }
}

class Greting{
    void greet(){
        System.out.println("Hello good morning");
    }

    void greet(String name){
        System.out.println("Hello " + name +  " good morning");
    }
}
