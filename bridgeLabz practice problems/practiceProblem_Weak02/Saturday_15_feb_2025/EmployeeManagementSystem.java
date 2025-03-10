import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary(); // Abstract method

    void displayDetails() {
        System.out.println(" === Employee Details ===");
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Name : " + name);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

interface Department {
    void assignedDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignedDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department Details : " + department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int workedHours;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workedHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return workedHours * hourlyRate;
    }

    @Override
    public void assignedDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department Details : " + department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Worked Hours : " + workedHours);
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println(getDepartmentDetails());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(1, "Ankit", 55000, 4500.55);
        emp1.assignedDepartment("Software Developer");
        employees.add(emp1);

        PartTimeEmployee emp2 = new PartTimeEmployee(2, "Jerry", 0, 7, 600);
        emp2.assignedDepartment("IT");
        employees.add(emp2);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("--------------------------------");
        }
    }
}
