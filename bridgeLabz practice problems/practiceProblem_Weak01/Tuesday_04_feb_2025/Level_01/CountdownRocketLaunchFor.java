package practiceProblem_Weak01.Tuesday_04_feb_2025.Level_01;

import java.util.Scanner;

public class CountdownRocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
        sc.close();
    }
}

