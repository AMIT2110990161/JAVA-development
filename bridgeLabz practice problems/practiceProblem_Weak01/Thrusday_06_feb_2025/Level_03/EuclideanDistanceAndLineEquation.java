package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean distance: " + distance);
        System.out.println("Line equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);

        sc.close();
    }

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        double m = (y2 - y1) / (x2 - x1);  // Slope
        double b = y1 - m * x1;  // Y-intercept
        equation[0] = m;
        equation[1] = b;
        return equation;
    }
}
