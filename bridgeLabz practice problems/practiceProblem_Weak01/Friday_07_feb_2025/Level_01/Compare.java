package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(compareString(str1, str2))System.out.println("Both the String are Equal by personal method");
        else System.out.println("Both the String are NOT Equal by personal method");
        
        if(str1.equals(str2))System.out.println("Both the String are Equal by in-built method");
        else System.out.println("Both the String are NOT Equal by in-built method");

        sc.close();

    }

    public static boolean compareString(String str1, String str2){
        if(str1.length() != str2.length())return false;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i))return false;
        }
        return true;
    }
}
