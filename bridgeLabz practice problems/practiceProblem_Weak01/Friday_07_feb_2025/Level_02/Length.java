package practiceProblem_Weak01.Friday_07_feb_2025.Level_02;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = 0;
        while(true){
            try {
                System.out.println(str.charAt(len));
            } catch (RuntimeException e) {
                System.out.println("Length of String is : " + len);
                return;
            }
            len++;
        }
    }
}
