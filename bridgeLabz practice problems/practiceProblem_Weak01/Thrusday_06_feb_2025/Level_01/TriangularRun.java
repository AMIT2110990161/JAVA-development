package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_01;

import java.util.Scanner;

public class TriangularRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The number of rounds to complete 5 km: " + rounds);
        
        sc.close();
    }

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }
}

