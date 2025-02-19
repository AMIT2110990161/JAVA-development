package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

class LowerCaseConverter {
    static String convertToLower(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String converted = convertToLower(text);
        String builtIn = text.toLowerCase();
        System.out.println(compareStrings(converted, builtIn));
    }
}
