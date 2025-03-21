package foodDeliveryApp;

public class Main {
    public static void main(String[] args) {
        String[] foodItems1 = {"Pizza", "Pasta", "Burger"};
        String[] foodItems2 = {"Sushi", "Ramen", "Tempura"};

        Restaurant restaurant1 = new Restaurant("Italian Delight", "Downtown", foodItems1);
        Restaurant restaurant2 = new Restaurant("Tokyo Treats", "Uptown", foodItems2);

        System.out.println("=== Restaurant 1 ===");
        restaurant1.displayDetails();
        System.out.println("\n=== Restaurant 2 ===");
        restaurant2.displayDetails();

        System.out.println("\nChecking Food Availability:");
        System.out.println("Is Pasta available in Italian Delight? " + restaurant1.isFoodAvailable("Pasta"));
        System.out.println("Is Sushi available in Italian Delight? " + restaurant1.isFoodAvailable("Sushi"));
    }
}
