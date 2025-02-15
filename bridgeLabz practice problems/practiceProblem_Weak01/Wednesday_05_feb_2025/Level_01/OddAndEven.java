package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Number is not a natural number");
            sc.close();
            return;
        }
        int k=0, j=0;
        int[] odd = new int[(num/2)+1];
        int[] even = new int[(num/2)+1];
        for(int i=1; i<=num; i++){
            if(i%2 == 0)even[k++] = i;
            else odd[j++] = i;
        }
        System.out.println("Odd numbers");
        for(int a:odd)System.out.print(a + " ");
        System.out.println();
        System.out.println("Even numbers");
        for(int a:even)System.out.print(a + " ");
        sc.close();
    }

}
