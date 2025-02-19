package practiceProblem_Weak01.Friday_07_feb_2025.Level_02;

import java.util.Scanner;
 
public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        split(str);
        sc.close();
    }
    static void split(String str){
        char[] arr = new char[str.length()];

        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }
        String word = "";
        for(char a:arr){
            if(a == ' '){
                System.out.println(word);
                word = "";
                continue;
            }
            word += a;
        }
    }
}
