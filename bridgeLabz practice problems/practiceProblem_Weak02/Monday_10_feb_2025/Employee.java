public class Employee {
    private String name;
    private int id;
    private long salary;

    public Employee(String name, int id, long salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployeedetails(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }


    public static void main(String[] args) {
        Employee emp = new Employee("Amit kumar", 161, 550000);
        emp.displayEmployeedetails();
    }
}
