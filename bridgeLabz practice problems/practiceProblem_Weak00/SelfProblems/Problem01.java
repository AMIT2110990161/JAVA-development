package practiceProblem_Weak00.SelfProblems;

import java.util.Scanner;

public class Problem01 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 1. Calculate Simple Interest
        //     Write a program to calculate simple interest using the formula:
        //     Simple Interest = (Principal * Rate * Time) / 100. Take Principal, Rate, and Time as inputs from the user.


        int pri = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int simpleIntrest = (pri * rate * time) / 100;
        System.out.println(simpleIntrest);




        sc.close();
    }
}
