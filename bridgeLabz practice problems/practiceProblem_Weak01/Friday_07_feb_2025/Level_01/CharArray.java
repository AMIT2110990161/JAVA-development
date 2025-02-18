package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = toCharArray(str);
        print(arr);
        char[] charArr = str.toCharArray();
        print(charArr);
        boolean result = compare(arr,charArr);
        System.out.println(result);
        sc.close();
    }

    static boolean compare(char[] arr, char[] charArr){
        if(arr.length != charArr.length)return false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != charArr[i])return false;
        }
        return true;
    }

    static char[] toCharArray(String str){
        char[] arr = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static void print(char[] arr){
        for(char a:arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
