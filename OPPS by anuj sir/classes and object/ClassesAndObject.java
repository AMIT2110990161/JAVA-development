
public class ClassesAndObject {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // d1.name = "Sheru";
        // d1.bark();
        // Dog d2 = new Dog();
        // d2.name = "Tommy";
        // d2.walk();
        Complex num = new Complex();
        num.a = 4;
        num.b = 9;
        num.print();
    }
}

class Complex{
    int a,b;
    
    void print(){
        System.out.println(a + "+" + b + "i");
    }
}

class Dog{
    String name;
    int age;
    
    void walk(){
        System.out.println(name + " is Walking");
    }

    void bark(){
        System.out.println(name + " is Barking");
    }
}
