package packagesAndEncapsulation.package1;

public class SonFreind {
    public static void main(String[] args) {
        Teacher s = new Teacher();
        System.out.println(s.schoolName);
        // System.out.println(s.id); The field Teacher.id is not visible because its private 
        System.out.println(s.numberOfSubject);
        System.out.println(s.name);
    }
}
