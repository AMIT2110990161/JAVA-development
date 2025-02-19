package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

class UpperCaseConverter {
    static String convertToUpper(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
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
        String converted = convertToUpper(text);
        String builtIn = text.toUpperCase();
        System.out.println(compareStrings(converted, builtIn));
    }
}

