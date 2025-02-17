package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Scanner;

public class NumberChecker_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int[] digits = storeDigits(number);
        
        System.out.println("Count of digits: " + countDigits(digits));
        System.out.println("Palindrome check: " + isPalindrome(digits));
        System.out.println("Duck number check: " + isDuckNumber(digits));
        
        sc.close();
    }

    public static int countDigits(int[] digits) {
        return digits.length;
    }

    public static int[] storeDigits(int number) {
        int count = 0;
        int temp = number;
        
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        
        int[] digits = new int[count];
        temp = number;
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        return digits;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        int j = 0;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[j++] = digits[i];
        }
        
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        
        return true;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }
}
