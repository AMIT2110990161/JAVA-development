package practiceProblem_Weak01.Wednesday_05_feb_2025.Level_02;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double[][] marks = new double[3][num];
        double[] percentage = new double[num];
        char[] grade = new char[num];


        System.out.print("Enter the Physics marks : ");
        for(int i=0; i<num; i++){
            marks[0][i] = sc.nextDouble();
        }
        System.out.print("Enter the Chemistry marks : ");
        for(int i=0; i<num; i++){
            marks[1][i] = sc.nextDouble();
        }
        System.out.print("Enter the Maths marks : ");
        for(int i=0; i<num; i++){
            marks[2][i] = sc.nextDouble();
        }
        
        for(int i=0; i<num; i++){
            percentage[i] = (marks[0][i] + marks[1][i] + marks[2][i])/3;
        }
        
        for(int i=0; i<num; i++){
            if(percentage[i] >= 80)grade[i] = 'A';
            else if(percentage[i] >= 70)grade[i] = 'B';
            else if(percentage[i] >= 60)grade[i] = 'C';
            else if(percentage[i] >= 50)grade[i] = 'D';
            else if(percentage[i] >= 40)grade[i] = 'E';
            else grade[i] = 'R';
        }

        for(int i=0; i<num; i++){
            System.out.println("Student " + (i+1) + " having percentage " + percentage[i] + " with Garde = " + grade[i]);
        }

        sc.close();

    }
}
