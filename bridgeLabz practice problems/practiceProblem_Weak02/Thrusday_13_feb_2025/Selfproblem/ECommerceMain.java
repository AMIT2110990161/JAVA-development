package practiceProblem_Weak02.Thrusday_13_feb_2025.Selfproblem;

import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
    Customer customer;

    Order(Customer customer) {
        this.customer = customer;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order for: " + customer.name);
        for (Product product : products) {
            System.out.println("Product: " + product.name + ", Price: " + product.price);
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}

public class ECommerceMain {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        Order order = new Order(customer);
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Phone", 500.00);
        order.addProduct(product1);
        order.addProduct(product2);
        order.showOrderDetails();
    }
}
