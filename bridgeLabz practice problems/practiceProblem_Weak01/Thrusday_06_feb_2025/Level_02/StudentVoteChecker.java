package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_02;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students: ");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println("Student " + (i + 1) + " can vote: " + canStudentVote(ages[i]));
        }
        sc.close();
    }

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}

