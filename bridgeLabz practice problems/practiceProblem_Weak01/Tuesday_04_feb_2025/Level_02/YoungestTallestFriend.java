package practiceProblem_Weak01.Tuesday_04_feb_2025.Level_02;

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age and height of Amar: ");
        int ageAmar = sc.nextInt();
        double heightAmar = sc.nextDouble();

        System.out.print("Enter age and height of Akbar: ");
        int ageAkbar = sc.nextInt();
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter age and height of Anthony: ");
        int ageAnthony = sc.nextInt();
        double heightAnthony = sc.nextDouble();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        System.out.println("Youngest Friend: ");
        if (youngestAge == ageAmar) {
            System.out.println("Amar");
        } else if (youngestAge == ageAkbar) {
            System.out.println("Akbar");
        } else {
            System.out.println("Anthony");
        }

        System.out.println("Tallest Friend: ");
        if (tallestHeight == heightAmar) {
            System.out.println("Amar");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("Akbar");
        } else {
            System.out.println("Anthony");
        }
        sc.close();
    }
}
