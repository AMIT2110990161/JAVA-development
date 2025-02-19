package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {
    static void generateException(String[] names) {
        String name = names[names.length];
    }

    static void handleException(String[] names) {
        try {
            String name = names[names.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        handleException(names);
    }
}
