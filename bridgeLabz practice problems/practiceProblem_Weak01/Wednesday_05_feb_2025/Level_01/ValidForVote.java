package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class ValidForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ageArr = new int[10];
        for(int i=0; i<ageArr.length; i++){
            System.out.print("Enter the age of " + (i+1) + " student : ");
            ageArr[i] = sc.nextInt();
            System.out.println();
        }
        for(int a:ageArr){
            if(a<0)System.out.println("Invalid age of Student");
            else if(a<18)System.out.println("Student age is " + a + ". and he/she cannot vote");
            else System.out.println("Student age is " + a + " and he/she can vote");
        }
        sc.close();
    }
}
