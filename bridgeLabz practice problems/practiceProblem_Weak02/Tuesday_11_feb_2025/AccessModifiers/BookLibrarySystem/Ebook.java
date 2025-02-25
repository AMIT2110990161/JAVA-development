package practiceProblem_Weak02.Tuesday_11_feb_2025.AccessModifiers.BookLibrarySystem;

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
    
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Programming", "John Doe");
        ebook.displayBookDetails();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
