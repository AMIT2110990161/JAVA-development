package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_01;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        sc.close();
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

