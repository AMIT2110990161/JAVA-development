package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[10];
        int idx = 0;
        while(n>0 && idx<arr.length){
            long num = n%10;
            arr[idx++] = num;
            n /= 10;
        }

        long large = -1;
        long secLarge = -1;
        for(int i=0; i<idx; i++){
            if(arr[i] > large){
                secLarge = large;
                large = arr[i];
            }else if(arr[i] > secLarge && arr[i] != large){
                secLarge = arr[i];
            }
        }
        System.out.println("Larget is : " + large);
        System.out.println("Secont Larget is : " + secLarge);
        sc.close();
    }
}
