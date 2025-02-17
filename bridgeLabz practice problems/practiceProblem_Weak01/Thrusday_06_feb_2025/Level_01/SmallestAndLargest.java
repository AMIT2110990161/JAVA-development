package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_01;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
        
        sc.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        return new int[] {smallest, largest};
    }
}
