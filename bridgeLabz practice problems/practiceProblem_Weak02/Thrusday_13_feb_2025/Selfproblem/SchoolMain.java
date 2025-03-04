package practiceProblem_Weak02.Thrusday_13_feb_2025.Selfproblem;

import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(Student student) {
        students.add(student);
        student.enrollCourse(this);
    }

    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("ABC High School");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        school.addStudent(student1);
        school.addStudent(student2);
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);
        student1.showCourses();
        student2.showCourses();
        course1.showEnrolledStudents();
        course2.showEnrolledStudents();
    }
}
