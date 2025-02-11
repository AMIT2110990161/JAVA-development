package practiceProblem_Weak02.Tuesday_11_feb_2025.Inctance_vs_class_variable_and_mathods;

public class Product {
    private String productName;
    private double price;
    static int totalProducts;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails(){
        System.out.println(productName + " is of " + price + "rs");
    }

    static void displayTotalProduct(){
        System.out.println("--------------Total number of Products-------------");
        System.out.println(totalProducts);
    }

    public static void main(String[] args) {
        Product pd = new Product("fitRaga", 6969.69);
        pd.displayProductDetails();
        Product pd1 = new Product("rangila", 5453);
        pd1.displayProductDetails();
        Product pd2 = new Product("rashilla", 6513.5);
        pd2.displayProductDetails();
        Product pd3 = new Product("falilla", 6654);
        pd3.displayProductDetails();
        Product.displayTotalProduct();
        
    }
}
