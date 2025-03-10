import java.util.ArrayList;

abstract class FoodItem implements IDiscountable {
    private String name;
    protected int price;
    protected int quantity;
    protected int discount;

    public FoodItem(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract int calculateTotalPrice();

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    @Override
    public void getDiscountDetails(){
        System.out.println("Discount Applied: " + discount);
    }
    @Override
    public void applyDiscount() {
        this.discount = (int)(this.price * 0.30);
    }
}

interface IDiscountable {
    void applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem{
    int packingCost;

    public VegItem(String name, int price, int quantity, int packingCost) {
        super(name, price, quantity);
        this.packingCost = packingCost;
    }

    @Override
    public int calculateTotalPrice(){
        return this.price * this.quantity + this.packingCost - this.discount;
    }
}

class NonVegItem extends FoodItem {
    int packingCost;
    int restaurantCost;

    public NonVegItem(String name, int price, int quantity, int packingCost, int restaurantCost) {
        super(name, price, quantity);
        this.packingCost = packingCost;
        this.restaurantCost = restaurantCost;
    }

    @Override
    public int calculateTotalPrice(){
        return this.price * this.quantity + this.packingCost + this.restaurantCost - this.discount;
    }

    @Override
    public void applyDiscount() {
        this.discount = (int)(this.price * 0.15);
    }
}
public class OnlineFoodDeliverySystem {
     public static void main(String[] args) {
        ArrayList<FoodItem> items = new ArrayList<>(){{
            add(new VegItem("Paneer Tikka", 340, 1, 10));
            add(new NonVegItem("Butter Chicken", 670, 2, 20, 30));
        }};

        for (FoodItem item : items) {
            item.getDetails();
            item.applyDiscount();
            item.getDiscountDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
        }
    }
}
