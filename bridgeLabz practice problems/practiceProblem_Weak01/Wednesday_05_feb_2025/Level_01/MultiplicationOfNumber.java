package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class MultiplicationOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here : ");
        int num = sc.nextInt();
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = num*(i+1);
        }
        for(int i=0; i<arr.length; i++){
            System.err.println(num + " * " + (i+1) + " = " + arr[i]);
        }

        sc.close();
    }
}
