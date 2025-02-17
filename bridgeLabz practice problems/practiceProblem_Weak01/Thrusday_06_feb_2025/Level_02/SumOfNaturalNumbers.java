package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_02;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for natural number sum: ");
        int n = sc.nextInt();
        System.out.println("Recursive sum: " + findRecursiveSum(n));
        System.out.println("Formula sum: " + findFormulaSum(n));
        sc.close();
    }

    public static int findRecursiveSum(int n) {
        if (n == 0) return 0;
        return n + findRecursiveSum(n - 1);
    }

    public static int findFormulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
}

