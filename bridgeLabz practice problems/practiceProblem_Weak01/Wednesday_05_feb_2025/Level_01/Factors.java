package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of : ");
        int num = sc.nextInt();
        int[] arr = new int[10];
        int idx = 0, n=1;
        while(n <= num && idx < arr.length){
            if(num % n == 0){
                arr[idx++] = n;
            }
            n++;
        }
        System.out.println("All the factorial of number ");

        for(int i=0; i<idx; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    } 
}
