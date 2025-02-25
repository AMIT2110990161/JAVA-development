package practiceProblem_Weak02.Tuesday_11_feb_2025.AccessModifiers.UniversityManagementSystem;

public class Student {
    public long rollNumber;
    protected String name;
    private double cgpa;

    public Student(){
        System.out.println("I am Default !");
    }

    public Student(long rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public Student(String name) {
        this.name = name;
    }

    public void getCgpa(){
        System.out.println(this.cgpa);
    }

    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    public static void main(String[] args) {
        Student st = new Student(2110990161, "Amit kumar", 8.20);
        st.getCgpa();
        st.setCgpa(8.21);
        st.getCgpa();
    }
}
