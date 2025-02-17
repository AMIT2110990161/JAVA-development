package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Random;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScoreCard(results);

        sc.close();
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];  // PCM scores for each student

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100);  // Physics score
            scores[i][1] = rand.nextInt(100);  // Chemistry score
            scores[i][2] = rand.nextInt(100);  // Math score
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];  // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    public static void displayScoreCard(double[][] results) {
        System.out.println("Student Score Card");
        System.out.println("Total\tAverage\tPercentage");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\n", results[i][0], results[i][1], results[i][2]);
        }
    }
}

