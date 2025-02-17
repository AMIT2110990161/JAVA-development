package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_01;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = checkNumberType(number);
        System.out.println("Result: " + result);
        
        sc.close();
    }

    public static int checkNumberType(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }
}
