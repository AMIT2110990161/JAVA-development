package practiceProblem_Weak02.Tuesday_11_feb_2025.Access_Modifiers;

public class Book {
    public int ISBN;
    protected String title;
    private String auther;

    public Book(int iSBN, String title, String auther) {
        this.ISBN = iSBN;
        this.title = title;
        this.auther = auther;
    }

    public Book(){
        System.out.println("Hey you are in constructor");
    }

    void setAuthor(String auther){
        this.auther = auther;
    }

    String getAuther(){
        if(auther == null)return "Auther name is not present here";
        return auther;
    }

    void displayInfo(){
        System.out.println(ISBN);
        System.out.println(title);
        System.out.println(auther);
    }

    public static void main(String[] args) {
        Book bk = new Book(161, "Raga infosolution", "Amit kumar");
        bk.displayInfo();
    }
}

