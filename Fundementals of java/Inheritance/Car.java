package Inheritance;

 public class Car extends Vehical {
    int numberOfDoors = 2;
    String model = "I10";
    void door(){
        System.out.println("this car have " + numberOfDoors + " door in it");
    }

    Car(){
        System.out.println("You are calling car");
    }
    final void start(){
        Break br = new Break();
        br.breaking(new Car());
        System.out.println("vehical is Starting");
    }
    Car(int numberOfDoors){
        System.out.println("Car have " + numberOfDoors + " doors");
    }
    public static void main(String[] args) {
        Car vc = new Car();
        vc.wheelsCount = 4;
        vc.numberOfDoors = 2;
        vc.door();
        vc.start(vc.wheelsCount);
        vc.start();
    }
}

class Break{
    void breaking(Car car){
        System.out.println(car.model + " is Applying breaks");
    }
}
