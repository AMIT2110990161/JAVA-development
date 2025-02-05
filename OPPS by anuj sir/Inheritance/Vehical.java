package Inheritance;

public class Vehical {
    int wheelsCount;
    int numberOfDoors = 4;

    Vehical(){
        System.out.println("You are calling Vehical");
    }

    void start(){
        System.out.println("vehical is Starting");
    }

    final void start(int wheelsCount){
        if(wheelsCount == 2)System.out.println("Bike is Starting");
        else if(wheelsCount == 4)System.out.println("Car is Starting");
    }
    public static void main(String[] args) {
        
    }
}
