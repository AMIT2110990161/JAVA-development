package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[100];
        int idx = 0;
        while(n>0 && idx<arr.length){
            long num = n%10;
            arr[idx++] = num;
            n /= 10;
        }

        for(int i=0; i<idx; i++)System.out.print(arr[i]);

        sc.close();
    }
}
