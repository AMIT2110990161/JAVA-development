package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Random;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] updatedEmployeeData = calculateBonusAndSalary(employeeData);
        displayEmployeeBonus(updatedEmployeeData);
    }

    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] data = new double[numEmployees][2];  // 2 columns: salary, years of service

        for (int i = 0; i < numEmployees; i++) {
            double salary = 10000 + rand.nextInt(90000);  // Random salary between 10000 and 99999
            double yearsOfService = rand.nextInt(20);  // Random years of service between 0 and 19
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        return data;
    }

    public static double[][] calculateBonusAndSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];  // 3 columns: salary, years of service, new salary

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = (yearsOfService > 5) ? 0.05 * salary : 0.02 * salary;
            double newSalary = salary + bonus;
            updatedData[i][0] = salary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    public static void displayEmployeeBonus(double[][] employeeData) {
        System.out.println("Employee Salary Details (Old Salary, New Salary, Bonus)");
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("Old Salary: %.2f, New Salary: %.2f, Bonus: %.2f\n", 
                employeeData[i][0], employeeData[i][1], employeeData[i][2]);
            totalOldSalary += employeeData[i][0];
            totalNewSalary += employeeData[i][1];
            totalBonus += employeeData[i][2];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }
}

