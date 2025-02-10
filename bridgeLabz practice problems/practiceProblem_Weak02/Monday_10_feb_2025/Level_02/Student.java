package Level_02;

public class Student {
    String name;
    int rollNumber;
    int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char grade(){
        int totalMarks = 0;
        for(int i:marks)totalMarks += i;

        int percentage = totalMarks/5;
        if(percentage > 90)return 'A';
        else if(percentage > 75)return 'B';
        else if(percentage > 60)return 'C';
        else if(percentage > 40)return 'D';
        else return 'F';
    }

    void details(){
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Grade : " + this.grade());
    }

    public static void main(String[] args) {
        int[] marksArr = {68, 96, 89, 93, 44};
        Student st = new Student("Amit kumar" , 161, marksArr);
        st.details();
    }
}
