package practiceProblemWeak01.SelfProblems;

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 2. Perimeter of a Rectangle
        // Write a program to calculate the perimeter of a rectangle. Take the length and width as inputs and use the formula:
        // Perimeter = 2 * (length + width).


    int len = sc.nextInt();
    int width = sc.nextInt();
    int perimeter = 2 * (len + width);
    System.out.println(perimeter);





        sc.close();
    }
}
