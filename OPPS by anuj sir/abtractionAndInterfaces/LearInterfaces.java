package abtractionAndInterfaces;

public class LearInterfaces {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.Hunt();
        pr.eat();
        pr.eatNonVeg();
        pr.walk();
    }
}

interface Carnivores{
    void eatNonVeg();
    void Hunt();
    void eat();
}

interface Human{
    void eat();
    void walk();
}

class Person implements Human, Carnivores{

    @Override
    public void eat() {
        System.out.println("Person can eat");
    }

    @Override
    public void walk() {
        System.out.println("Person can walk");
    }
    
    @Override
    public void eatNonVeg() {
        System.out.println("Person can eatNonVeg");
    }
    
    @Override
    public void Hunt() {
        System.out.println("Person can hunt");
    }
    
}
