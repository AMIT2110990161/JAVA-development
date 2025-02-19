package practiceProblem_Weak01.Friday_07_feb_2025.Level_02;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();

        int vowels = 0;
        int constants = 0;
        int notCharacter = 0;

        for(char ch:str.toCharArray()){
            if(ch < 'a' && ch <'z')notCharacter++;
            else if("aeiou".indexOf(ch) != -1)vowels++;
            else constants++;
        }

        System.out.println("Vowels count is : " + vowels);
        System.out.println("constants count is : " + constants);
        System.out.println("not count is : " + notCharacter);
        sc.close();
    }
}