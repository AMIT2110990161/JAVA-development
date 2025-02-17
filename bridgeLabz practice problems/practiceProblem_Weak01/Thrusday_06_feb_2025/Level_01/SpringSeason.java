package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_01;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        boolean isSpring = isSpringSeason(month, day);
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }

    public static boolean isSpringSeason(int month, int day) {
        return (month > 2 && month < 6) || (month == 3 && day >= 20) || (month == 6 && day <= 20);
    }
}

