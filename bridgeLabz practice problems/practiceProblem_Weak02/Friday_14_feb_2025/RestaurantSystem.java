package practiceProblem_Weak02.Friday_14_feb_2025;

// Restaurant Management System with Hybrid Inheritance
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is a Chef specializing in " + specialty);
    }
}

class Waiter extends Person implements Worker {
    int tableNumber;

    Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }

    public void performDuties() {
        System.out.println(name + " is a Waiter serving table number " + tableNumber);
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Emily", 102, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}
