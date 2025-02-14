package practiceProblem_Weak01.Tuesday_04_feb_2025.Level_01;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
            if (number != 0) {
                total += number;
            }
        } while (number != 0);

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
