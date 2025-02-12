package practiceProblem_Weak00.AssitedProblems;

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        // Write a program that takes two numbers as input from the user and prints their sum.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.err.println(sum);
        sc.close();
    }
        
}
