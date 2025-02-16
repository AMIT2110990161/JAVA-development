package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num+1];
        for(int i=1; i<arr.length; i++){
            if(i%3 == 0 && i%5 == 0)arr[i] = "FizzBuzz";
            else if(i%3 == 0)arr[i] = "Fizz";
            else if(i%5 == 0)arr[i] = "Buzz";
            else arr[i] = i+"";
        }
        int cnt = 0;
        for(String a:arr){
            System.out.println((cnt++) + " position is : " + a);
        }
        sc.close();
    }
}
