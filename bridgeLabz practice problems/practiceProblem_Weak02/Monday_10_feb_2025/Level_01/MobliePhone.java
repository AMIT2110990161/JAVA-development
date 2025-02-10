package Level_01;
public class MobliePhone {
    private String brand;
    private String model;
    private float price;

    public MobliePhone(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void mobliePhoneDetails(){
        System.out.println("Moblie Brand : " + brand);
        System.out.println("Moblie Model : " + model);
        System.out.println("Moblie Price : " + price);
        System.out.println("--------------------------NEXT---------------------------");
    }

    public static void main(String[] args) {
        MobliePhone mb = new MobliePhone("RAGA", "RA161", 23000.99f);
        MobliePhone mb1 = new MobliePhone("Realme", "RM161", 6000.00f);
        mb.mobliePhoneDetails();
        mb1.mobliePhoneDetails();
    }
}