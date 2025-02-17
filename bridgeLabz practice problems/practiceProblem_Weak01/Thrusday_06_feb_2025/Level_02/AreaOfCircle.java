package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_02;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = calculateArea(radius);
        System.out.println("Area of the circle: " + area);
        sc.close();
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

