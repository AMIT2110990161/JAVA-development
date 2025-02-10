package Level_02;

public class CartItem {
    String itemName;
    int price;
    int quantity;
    static int finalBillPrice;


    public CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    int totalCost(){
        int totalCost = price*quantity;
        finalBillPrice += totalCost;
        return totalCost;
    }

    void fullDetails(){
        System.out.println(itemName + " is of " + price + " rs and you bought " + quantity + " of them, your total amount: " + totalCost());
    }



    public static void main(String[] args) {
        CartItem ct1 = new CartItem("Apple", 60, 4);
        ct1.fullDetails();
        CartItem ct2 = new CartItem("Banana", 15, 6);
        ct2.fullDetails();
        CartItem ct3 = new CartItem("DragonFruit", 140, 5);
        ct3.fullDetails();
        System.out.println("------------------------Final Bill Price------------------------");
        System.out.println(finalBillPrice);

    }
}
