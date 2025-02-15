package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class StateOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the num here : ");
            arr[i] = sc.nextInt();
        } 
        for(int a:arr){
            if(a == 0)System.out.println("Number is zero");
            else if(a<0)System.out.println("Number is Negative");
            else{
                if(a%2 == 0)System.out.println("Number is positive and even");
                else System.out.println("Number is positive and odd");
            }
        }
        sc.close();
    }
}
