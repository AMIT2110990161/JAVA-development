package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class MeanHeightOfPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[11];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the age of " + (i+1) + " player : ");
            arr[i] = sc.nextDouble();
        }
        double sumOfAge = 0;
        for(double a:arr){
            sumOfAge += a;
        }
        double mean = sumOfAge/11;
        System.out.println("Mean age of football player : " + mean);
        sc.close();
        System.out.println();
    }
}
