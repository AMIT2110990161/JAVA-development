package practiceProblem_Weak02.Tuesday_11_feb_2025.Level_01;

public class Book {
    private String title;
    private String auther = "Amit kumar chaturvedi";
    private double price;

    public Book(String title, String auther, double price) {
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Book(){
        this.title = "Raga business studies";
        this.auther = "Amit kumar";
        this.price = 5623.23;
    }

    void details(){
        System.out.println(title);
        System.out.println(auther);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book bk = new Book();
        bk.details();
        Book bk1 = new Book("raga", "chaman", 6598);
        bk1.details();
        Book bk3 = new Book("panda", 651);
        bk3.details();
    }
}
