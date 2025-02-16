package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class BMIcalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        double[][] userData = new double[3][num];
        String[] weightStatus = new String[num];

        System.out.print("put the Weight of all the person here : ");
        for(int i=0; i<num; i++){
            userData[0][i] = sc.nextDouble();
        }
        System.out.print("put the Height of all the person here : ");
        for(int i=0; i<num; i++){
            userData[1][i] = sc.nextDouble();
        }

        for(int i=0; i<num; i++){
            userData[2][i] = userData[0][i]/userData[1][i];
        }
        
        for(int i=0; i<num; i++){
            if(userData[2][i] >= 40.0)weightStatus[i] = "Obese";
            else if(userData[2][i] >= 25.0)weightStatus[i] = "OverWeight";
            else if(userData[2][i] >= 18.5)weightStatus[i] = "Normal";
            else weightStatus[i] = "UnderWeight";
        }
        
        for(int i=0; i<num; i++){
            System.out.println("Emploee " + (i+1) + " have " + userData[0][i] + " kg Weight and " + userData[1][i] + " meter Height, and BMI is " + userData[2][i] + " and status is " + weightStatus[i]);
        }
        sc.close();
    }
}
