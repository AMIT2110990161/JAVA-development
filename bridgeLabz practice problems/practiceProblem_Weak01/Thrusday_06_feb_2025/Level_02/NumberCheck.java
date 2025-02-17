package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_02;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive");
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is even");
                } else {
                    System.out.println(numbers[i] + " is odd");
                }
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }
        
        System.out.println("Comparison of first and last numbers: " + compare(numbers[0], numbers[4]));
        sc.close();
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 == number2) return 0;
        return -1;
    }
}

