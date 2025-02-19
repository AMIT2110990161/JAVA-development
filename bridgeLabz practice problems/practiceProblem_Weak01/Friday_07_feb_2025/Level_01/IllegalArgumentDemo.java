package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

class IllegalArgumentDemo {
    static void generateException(String text) {
        String result = text.substring(5, 2);
    }

    static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        handleException(text);
        scanner.close();
    }
}

