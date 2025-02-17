package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_02;

import java.util.Scanner;

public class FindYoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter ages and heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }
        System.out.println("Youngest friend: " + findYoungest(ages));
        System.out.println("Tallest friend: " + findTallest(heights));
        sc.close();
    }

    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int age : ages) {
            if (age < youngest) {
                youngest = age;
            }
        }
        return youngest;
    }

    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (double height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}

