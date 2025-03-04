package practiceProblem_Weak02.Thrusday_13_feb_2025.Selfproblem;

import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class Professor {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this);
    }
}

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Professor professor = new Professor("Dr. Smith");
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Algorithms");
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        professor.assignCourse(course1);
        professor.assignCourse(course2);
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
    }
}

