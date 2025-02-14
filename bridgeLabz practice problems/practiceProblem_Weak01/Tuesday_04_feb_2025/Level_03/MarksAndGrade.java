package practiceProblem_Weak01.Tuesday_04_feb_2025.Level_03;

import java.util.Scanner;

public class MarksAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;
        String grade = "";
        String remarks = "";

        if (average >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (average >= 75) {
            grade = "A";
            remarks = "Very Good";
        } else if (average >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        sc.close();
    }
}

