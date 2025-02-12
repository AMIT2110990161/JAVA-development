package practiceProblem_Weak00.AssitedProblems;

import java.util.Scanner;

public class Problem05 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 5. Volume of a Cylinder
        // Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula:
        // Volume = π * radius^2 * height.


    double radius = sc.nextDouble();
    double height = sc.nextDouble();
    double volume = 3.14 * Math.pow(radius, 2) * height;
    System.out.println(volume);




        sc.close();
    }
}
