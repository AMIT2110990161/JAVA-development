package practiceProblem_Weak02.Thrusday_13_feb_2025.AssistedProblems;

import java.util.ArrayList;

public class Library {
    private ArrayList<ArrayList<String>> li = new ArrayList<>();

    public void addBook(String title, String auther){
        ArrayList<String> list = new ArrayList<>();
        list.add(title);
        list.add(auther);
        li.add(list);
    }

    public void printAllBooks(){
        System.out.println(li);
    }
    public static void main(String[] args) {
        Library lbr = new Library();
        Book b1 = new Book("Raga100", "Amit kumar");
        Book b2 = new Book("Raga100", "Amit kumar");
        Book b3 = new Book("Raga100", "Amit kumar");
        Book b4 = new Book("Raga100", "Amit kumar");
        lbr.addBook(b1.title, b1.auther);
        lbr.addBook(b2.title, b2.auther);
        lbr.addBook(b3.title, b3.auther);
        lbr.addBook(b4.title, b4.auther);

        lbr.printAllBooks();
    }
}

class Book{
    String title;
    String auther;

    public Book(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }
}
