package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class TallestFreind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        System.out.println("Put Height of three here");
        for(int i=0; i<arr[0].length; i++){
            arr[0][i] = sc.nextInt();
        }
        System.out.println("Put Age of three here");
        for(int i=0; i<arr[0].length; i++){
            arr[1][i] = sc.nextInt();
        }
        String tallest = arr[0][0] > arr[0][1] ? "Amar" : arr[0][1] > arr[0][2] ? "Akbar" : "Anthony";
        String youngest = arr[1][0] > arr[1][1] ? "Amar" : arr[1][1] > arr[1][2] ? "Akbar" : "Anthony";
        System.out.println( "the Tallest is : " + tallest);
        System.out.println( "the Youngest is : " + youngest);

        
        sc.close();
    }
}
