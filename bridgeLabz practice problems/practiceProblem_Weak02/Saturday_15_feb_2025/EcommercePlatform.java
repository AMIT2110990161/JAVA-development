import java.util.ArrayList;

abstract class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    double calculateTax() {
        return 0.0;
    }

    abstract double calculateDiscount(); // abstract method

    void displayFinalPrice() {
        double finalPrice = getPrice() + calculateTax() - calculateDiscount();
        System.out.println(getProductName() + " Final Price: " + finalPrice);
    }

    void showDetails() {
        System.out.println("===== Product Details =====");
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discountRate = 0.10;
    private double taxRate = 0.15;

    public Electronics(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: " + (taxRate * 100) + "%";
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + calculateTax());
        System.out.println(getTaxDetails());
    }
}

class Clothing extends Product implements Taxable {
    private double discountRate = 0.20;
    private double taxRate = 0.05;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: " + (taxRate * 100) + "%";
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + calculateTax());
        System.out.println(getTaxDetails());
    }
}

class Groceries extends Product implements Taxable {
    private double discountRate = 0.05;
    private double taxRate = 0.02; 

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax: " + (taxRate * 100) + "%";
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + calculateTax());
        System.out.println(getTaxDetails());
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Electronics e1 = new Electronics(1, "Fan", 1500.00);
        Clothing c1 = new Clothing(2, "Hoodie", 895.00);
        Groceries g1 = new Groceries(3, "Rice", 60.00);

        ArrayList<Product> products = new ArrayList<>();
        products.add(e1);
        products.add(c1);
        products.add(g1);

        for (Product product : products) {
            product.showDetails();
            product.displayFinalPrice();
            System.out.println("-----------------------------");
        }
    }
}
