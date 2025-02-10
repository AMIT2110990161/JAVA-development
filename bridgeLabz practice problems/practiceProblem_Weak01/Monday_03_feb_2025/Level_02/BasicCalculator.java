package practiceProblem_Weak01.Monday_03_feb_2025.Level_02;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();

        float addition = num1 + num2;
        float subtraction = num1-num2;
        float multiplication = num1*num2;
        float division = num1/num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 number " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
        sc.close();
    }
    
}
