package practiceProblem_Weak01.Tuesday_04_feb_2025.Level_03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result = 0;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
