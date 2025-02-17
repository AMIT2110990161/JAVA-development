package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_02;

import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();
        
        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Status: " + getBMIStatus(bmi));
        sc.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obesity";
    }
}

