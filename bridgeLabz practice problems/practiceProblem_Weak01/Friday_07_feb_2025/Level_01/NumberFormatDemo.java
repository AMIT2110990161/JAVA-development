package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

class NumberFormatDemo {
    static void generateException(String text) {
        int number = Integer.parseInt(text);
    }

    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        handleException(text);
    }
}
