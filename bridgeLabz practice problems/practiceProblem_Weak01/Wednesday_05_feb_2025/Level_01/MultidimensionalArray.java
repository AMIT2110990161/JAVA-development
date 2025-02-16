package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of column you want : ");
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Enter the values of 2d-Array");
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("2d-Array in 1d-Array");
        int[] arr = new int[n*m];
        int k = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                arr[k++] = array[i][j];
            }
        }

        for(int a:arr){
            System.out.print(a + " ");
        }
        sc.close();
    }
}
