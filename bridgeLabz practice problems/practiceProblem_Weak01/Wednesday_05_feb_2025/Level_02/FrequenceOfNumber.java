package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class FrequenceOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here : ");
        long num = sc.nextLong();
        int[] arr = new int[10];
        while(num > 0){
            arr[(int)(num%10)]++;
            num /= 10;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0)System.out.println(i + " is having frequancy of " + arr[i]);
        }
        sc.close();
    }
}
