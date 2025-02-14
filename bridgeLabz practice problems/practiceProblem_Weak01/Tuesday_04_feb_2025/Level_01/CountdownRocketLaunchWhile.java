package practiceProblem_Weak01.Tuesday_04_feb_2025.Level_01;

import java.util.Scanner;

public class CountdownRocketLaunchWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch!");
        sc.close();
    }
}

