package practiceProblem_Weak01.Friday_07_feb_2025.Level_02;

import java.util.Scanner;

public class StoreSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        split(str);
        sc.close();
    }
    static void split(String str){
        char[] arr = new char[str.length()];
        int cntSpace = 0;
        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i);
            if(arr[i] == ' ')cntSpace++;
        }
        String word = "";
        String[][] strArr = new String[2][cntSpace];
        int k = 0;
        for(char a:arr){
            if(a == ' '){
                strArr[0][k] = word;
                strArr[1][k++] = String.valueOf(word.length()); //word.length() + "";
                word = "";
                continue;
            }
            word += a;
        }
        printArray(strArr);
    }
    static void printArray(String[][] arr){
        for(int i=0; i<arr[0].length; i++){
            System.out.println(arr[0][i] + " is the word and Length : " + arr[1][i]);
        }
    }
}
