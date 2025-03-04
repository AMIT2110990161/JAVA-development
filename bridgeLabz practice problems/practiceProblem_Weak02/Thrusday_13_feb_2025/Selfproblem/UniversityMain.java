package practiceProblem_Weak02.Thrusday_13_feb_2025.Selfproblem;

import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Faculty> faculties = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }
}

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University("XYZ University");
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mechanical Engineering");
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");
        dept1.addFaculty(faculty1);
        dept2.addFaculty(faculty2);
        university.addDepartment(dept1);
        university.addDepartment(dept2);
    }
}
