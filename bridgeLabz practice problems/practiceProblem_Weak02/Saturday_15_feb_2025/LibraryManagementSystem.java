import java.util.ArrayList;

abstract class LibraryItem implements IReservable {
    static int totalItems = 0;
    int itemId;
    String title;
    String author;
    int loanDuration;
    boolean reserved;

    public LibraryItem(String title, String author) {
        this.itemId = ++totalItems;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Duration: " + this.loanDuration);
    }

    @Override
    public void reserveItem(){
        this.reserved = true;
    }

    @Override
    public void checkAvailability(){
        if(this.reserved){
            System.out.println("Book is not available");
        } else{
            System.out.println("Book is available");
        }
    }
}

interface IReservable {
    void reserveItem();
    void checkAvailability();
}

class Book extends LibraryItem{
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLoanDuration(){
        this.loanDuration = (int)(Math.random()*100);
        return this.loanDuration;
    }
}

class DVD extends LibraryItem{
    public DVD(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLoanDuration(){
        this.loanDuration = (int)(Math.random()*10);
        return this.loanDuration;
    }
}

class Magazine extends LibraryItem{
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLoanDuration(){
        this.loanDuration = (int)(Math.random()*50);
        return this.loanDuration;
    }

}

public class LibraryManagementSystem {
     public static void main(String[] args) {
        ArrayList<LibraryItem> list = new ArrayList<>(){{
            add(new Book("Hell", "Hitler"));
            add(new Magazine("Vogue", "NYC"));
            add(new DVD("1920", "British Council"));
        }};

        list.get(1).reserveItem();

        for (LibraryItem item : list) {
            item.getLoanDuration();
            item.getItemDetails();
            item.checkAvailability();
        }
    }
}
