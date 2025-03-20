package Inheritance;

final public class Tempo  extends Car{
    final int num = 4;
    Tempo(){
        super(4);
        System.out.println("You are calling Tempo");
    }

    public static void main(String[] args) {
        Tempo tp = new Tempo();
        tp.start();
        System.out.println(tp.num);
    }
}
