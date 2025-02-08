package practiceProblemWeak01.AssitedProblems;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 3. Celsius to Fahrenheit Conversion
        //     Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula:
        //     Fahrenheit = (Celsius * 9/5) + 32.


        int temp = sc.nextInt();
        int Fahrenheit = (temp * 9/5) + 32;
        System.out.println(Fahrenheit);



        sc.close();
    }
}
