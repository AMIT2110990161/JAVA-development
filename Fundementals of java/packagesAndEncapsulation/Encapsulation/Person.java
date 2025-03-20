package packagesAndEncapsulation.Encapsulation;

public class Person {
    static int pin = 7023;
    static{
        System.out.println("this is Static");
    }
    public static void main(String[] args) {
        System.out.println("non static bolck");
        Main m = new Main();
        String result = m.getData(Person.pin);
        System.out.println(result);
    }
}
 