public class Item {
    int itemCode;
    String itemName;
    float price;

    Item(int code, String name, float price){
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    public void itemDetailes(){
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Item Price : " + price);
    }

    public float finalPrice(int quant){
        float finalPrice = this.price*quant;
        return finalPrice;
    }

    public static void main(String[] args) {
        Item it = new Item(161, "fitRaga", 9999.00f);
        it.itemDetailes();
        float finalPrice = it.finalPrice(2);
        System.out.println(finalPrice);
    }
}
