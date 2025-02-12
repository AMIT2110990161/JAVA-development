package practiceProblem_Weak01.Tuesday_04_feb_2025.Level_01;

import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
        sc.close();
    }
}

