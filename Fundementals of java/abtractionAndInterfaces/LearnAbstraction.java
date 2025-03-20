package abtractionAndInterfaces;

public class LearnAbstraction {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.accelrate();
        int num = cr.numberOfTyre(6);
        System.out.println(num);
        String str = cr.color("Red");
        System.out.println(str);
        cr.horn();
    }
}

abstract class Vehical{
    abstract void accelrate();
    abstract int numberOfTyre(int num);
    abstract String color(String clr);
    void horn(){
        System.out.println("Car is making Horn work");
    }
}

class Car extends Vehical {

    @Override
    void accelrate() {
        System.out.println("Car is Accelrating");
    }

    @Override // just used to check spelling no other use.
    int numberOfTyre(int num) {
        return num;
    }

    @Override
    String color(String clr) {

        return "you are in color section and clr is " + clr;
    }

}
