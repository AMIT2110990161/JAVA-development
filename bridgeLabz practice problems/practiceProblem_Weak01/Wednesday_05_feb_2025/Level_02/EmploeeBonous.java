package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class EmploeeBonous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] salery = new int[10];
        int[] expirence = new int[10];
        
        int totalBounce = 0, totalOldSalery = 0, totalNewSolery = 0;
        
        for(int i=0; i<10; i++){
            System.out.print("Salery " + (i+1) + " : ");
            int sal = sc.nextInt();
            System.out.print("Experince " + (i+1) + " : ");
            int ex = sc.nextInt();
            if(sal<0 || ex < 0){
                System.out.println("Pls enter valid Data");
                i--;
            }else{
                salery[i] = sal;
                expirence[i] = ex;
            }
        }
        
        int[] newsalery = new int[10];

        for(int i=0; i<10; i++){
            double bonus = 0;
            if(expirence[i] > 5){
                bonus = salery[i] * .005;
            }else bonus = salery[i] * .002;
            newsalery[i] = (int) (salery[i] + bonus);
            totalBounce += bonus;
            totalOldSalery += salery[i];
            totalNewSolery += newsalery[i];
        }

        System.out.println("Old Salery : " +  totalOldSalery);
        System.out.println("new Salery : " +  totalNewSolery);
        System.out.println("Bounce : " + totalBounce);

        sc.close();
    }
}
