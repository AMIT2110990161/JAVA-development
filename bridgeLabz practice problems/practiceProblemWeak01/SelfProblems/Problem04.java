package practiceProblemWeak01.SelfProblems;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 4. Calculate Average of Three Numbers
        // Write a program that takes three numbers as input from the user and prints their average.


    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int avg = (num1 + num2 + num3)/3;
    System.out.println(avg);








        sc.close();
    }
}
