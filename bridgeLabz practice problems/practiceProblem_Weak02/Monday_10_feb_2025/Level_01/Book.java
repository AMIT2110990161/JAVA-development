package Level_01;
public class Book {
    String title;
    String auther;
    float price;

    Book(String title, String auther, float price){ // constructor -> initilizing the value of instance variable
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    public void bookDetails(){
        System.out.println("Title of book : " + title);
        System.out.println("Auther of book : " + auther);
        System.out.println("Price of book : " + price);
    }
    public static void main(String[] args) {
        Book bk = new Book("Raga fit", "Amit kumar", 28.5f);
        bk.bookDetails();
    }
}
