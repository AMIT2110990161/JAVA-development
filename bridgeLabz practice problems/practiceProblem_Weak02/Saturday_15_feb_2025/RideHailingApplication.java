import java.util.ArrayList;

abstract class Vehicle implements IGPS {
    private static int totalVehicles = 0;
    private int vehicleId;
    private String driverName;
    private int ratePerKm;

    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public int getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(int ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public Vehicle(String driverName, int ratePerKm) {
        this.vehicleId = ++totalVehicles;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract void calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }


    @Override
    public void getCurrentLocation(){
        System.out.println("Location Fetched!!");
    }

    @Override
    public void updateLocation() {
        System.out.println("Location Updated!!");
    }
}

interface IGPS {
    void getCurrentLocation();
    void updateLocation();
}

class Car extends Vehicle {

    public Car(String driverName, int ratePerKm) {
        super(driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Total Fare: " + (getRatePerKm() * distance + 40));
    }
}

class Auto extends Vehicle {
    public Auto(String driverName, int ratePerKm) {
        super(driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Total Fare: " + (getRatePerKm() * distance + 25));
    }
}

class Bike extends Vehicle {
    public Bike(String driverName, int ratePerKm) {
        super(driverName, ratePerKm);
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Total Fare: " + (getRatePerKm() * distance + 20));
    }
}

public class RideHailingApplication {
     public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>(){{
            add(new Bike("Ali", 10));
            add(new Car("Harry", 23));
            add(new Auto("Bali", 16));
        }};

        for (Vehicle vehicle : vehicles) {
            vehicle.calculateFare((int)(Math.random()*100));
            vehicle.updateLocation();
        }
    }
}
