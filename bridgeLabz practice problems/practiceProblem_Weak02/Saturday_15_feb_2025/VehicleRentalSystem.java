import java.util.ArrayList;

abstract class Vehicle{
    private int vehicleNumber;
    private String vehicleType;
    private double rentalRate;

    public Vehicle(int vehicleNumber, String vehicleType, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    public int getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(int vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate = rentalRate;
    }

    abstract double calculateRentalCost(int days);

    void displayRentalDetails(int days) {
        displayDetails();
        System.out.println("Rental Cost for " + days + " days : " + calculateRentalCost(days));
        System.out.println("---------------------------------");
    }

    void displayDetails(){
        System.out.println("==== Vehicle Rental System ====");
        System.out.println("Vehicle Number : "+vehicleNumber);
        System.out.println("Vehicle Type : "+vehicleType);
        System.out.println("Rental Rate : "+rentalRate);
    }
}

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable{
    private final double insuranceRate = 0.02;
    
    public Car(int vehicleNumber, String vehicleType, double rentalRate) {
        super(vehicleNumber, vehicleType, rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "2% daily of rental cost of car";
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Insurance Cost per day : "+calculateInsurance());
        System.out.println(getInsuranceDetails());
    }

    
}

class Bike extends Vehicle implements Insurable{
    private final double insuranceRate = 0.01;
    public Bike(int vehicleNumber, String vehicleType, double rentalRate) {
        super(vehicleNumber, vehicleType, rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1)*insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "1% daily of rental cost of bike";
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Insurance cost per day : "+calculateInsurance());
        System.out.println(getInsuranceDetails());
    }

    
}

class Truck extends Vehicle implements Insurable {
    private final double insuranceRate = 0.03;

    public Truck(int vehicleNumber, String vehicleType, double rentalRate){
        super(vehicleNumber, vehicleType, rentalRate);

    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Rate: 3% of daily rental cost";
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Insurance Cost per Day : " + calculateInsurance());
        System.out.println(getInsuranceDetails());
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car(1014, "SUV", 2000.00);
        Bike bike = new Bike(1452, "Racing", 900.00);
        Truck truck = new Truck(6144, "Loader", 5000);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        int rentalDays = 5;
        for(Vehicle vehicle : vehicles){
            vehicle.displayRentalDetails(rentalDays);

        }
    }
}
