package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_01;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigonometricValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigonometricValues[0]);
        System.out.println("Cosine: " + trigonometricValues[1]);
        System.out.println("Tangent: " + trigonometricValues[2]);
        
        sc.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radian = Math.toRadians(angle);
        return new double[] {Math.sin(radian), Math.cos(radian), Math.tan(radian)};
    }
}

