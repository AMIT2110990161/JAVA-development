package practiceProblem_Weak00.AssitedProblems;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 4. Area of a Circle
        // Write a program to calculate the area of a circle. Take the radius as input and use the formula:
        // Area = π * radius^2.


    double radius = sc.nextDouble();
    double area = 3.14 * Math.pow(radius, 2);
    System.out.println(area);



        sc.close();
    }
}
