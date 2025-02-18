package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int st = 2;
        int ed = 5;
        System.out.println(subString(str, st, ed));
        System.out.println("Inbuilt method");
        System.out.println(str.substring(2, 5));

        sc.close();
    }

    static String subString(String str, int st, int ed){
        StringBuilder sb = new StringBuilder();
        for(int i=st; i<ed; i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
