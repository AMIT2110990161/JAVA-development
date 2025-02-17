package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Scanner;

public class NumberChecker_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
        System.out.println("Is Spy: " + isSpy(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz: " + isBuzz(number));
        
        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;
    }

    // Method to check if a number is spy
    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        
        return sumOfDigits == productOfDigits;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;
        
        while (square >= 10) {
            if (square % 10 != temp % 10) return false;
            square /= 10;
            temp /= 10;
        }
        
        return true;
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}

