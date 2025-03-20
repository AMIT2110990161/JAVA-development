package packagesAndEncapsulation.package1;

public class Teacher {
    // Public anyone can acces from this Package and other Packages also.
    public String schoolName = "GR global";
    // Private only this class can have acces
    private int id = 0161;
    // Default if you have not mentiond any thing then its default and only this package can access it
    int numberOfSubject = 2; 
    // Protected this package can acces but child from other package cant access it. 
    protected String name = "Amit Kumar";

    public static void main(String[] args) {
        Teacher t = new Teacher();
        System.out.println(t.schoolName);
        System.out.println(t.id);
        System.out.println(t.numberOfSubject);
        System.out.println(t.name);
    }
}
