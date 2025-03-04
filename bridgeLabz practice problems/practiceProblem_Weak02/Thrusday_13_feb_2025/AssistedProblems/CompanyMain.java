package practiceProblem_Weak02.Thrusday_13_feb_2025.AssistedProblems;

// Company and Departments (Composition)
import java.util.ArrayList;

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department department) {
        departments.add(department);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        Department dept = new Department("IT");
        Employee emp = new Employee("Alice");
        dept.addEmployee(emp);
        company.addDepartment(dept);
    }
}
