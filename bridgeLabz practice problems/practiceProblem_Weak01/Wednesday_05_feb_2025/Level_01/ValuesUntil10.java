package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_01;

import java.util.Scanner;

public class ValuesUntil10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int i=0;
        while(true){
            System.out.print("Enter the value here : ");
            int n = sc.nextInt();
            if(n <= 0 || i == 10)break;
            arr[i] = n;
            i++;
        }
        int sum = 0;
        for(int j=0; j<i; j++){
            sum += arr[j];
        }
        System.out.println(sum);
        sc.close();
    }
}
