package practiceProblem_Weak02.Tuesday_11_feb_2025.Inctance_vs_class_variable_and_mathods;

public class Course {
    private String courseName;
    private int duration;
    private double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    static String institutName = "RAGA institute of technology";

    void displayCourseDetails(){
        System.err.println("---------Institut Name----------------");
        System.err.println(institutName);
        System.err.println("---------Course Information-----------");
        System.out.println(courseName + " is of " + duration + " months only");
        System.out.println("Fees for the course : " + fee);
        System.out.println("---------------End of Information------------");
    }

    static void updateInstitutName(String newName){
        institutName = newName;
    }

    public static void main(String[] args) {
        Course c = new Course("java" , 4 , 4685);
        c.displayCourseDetails();
        Course c1 = new Course("c++" , 6 , 4685);
        c1.displayCourseDetails();
        Course.updateInstitutName("Chitkara university");
        Course c2 = new Course("react" , 4 , 4685);
        c2.displayCourseDetails();
        Course c3 = new Course("javaScript" , 2 , 4685);
        c3.displayCourseDetails();
    }
}
