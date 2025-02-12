package practiceProblem_Weak00.SelfProblems;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 3. Power Calculation
        //     Write a program that takes two numbers as input: a base and an exponent,and prints the result of base raised to the exponent (without using loops or conditionals).


        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double ans = Math.pow(num1, num2);
        System.out.println(ans);






        sc.close();
    }
}
