package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        double[] weight = new double[num];
        double[] height = new double[num];
        double[] BMI = new double[num];
        String[] weightStatus = new String[num];

        System.out.print("put the Weight of all the person here : ");
        for(int i=0; i<num; i++){
            weight[i] = sc.nextDouble();
        }
        System.out.print("put the Height of all the person here : ");
        for(int i=0; i<num; i++){
            height[i] = sc.nextDouble();
        }

        for(int i=0; i<num; i++){
            BMI[i] = weight[i]/height[i];
        }
        
        for(int i=0; i<num; i++){
            if(BMI[i] >= 40.0)weightStatus[i] = "Obese";
            else if(BMI[i] >= 25.0)weightStatus[i] = "OverWeight";
            else if(BMI[i] >= 18.5)weightStatus[i] = "Normal";
            else weightStatus[i] = "UnderWeight";
        }
        
        for(int i=0; i<num; i++){
            System.out.println("Emploee " + (i+1) + " have " + weight[i] + " kg Weight and " + height[i] + " meter Height, and BMI is " + BMI[i] + " and status is " + weightStatus[i]);
        }
        sc.close();
    }
}
