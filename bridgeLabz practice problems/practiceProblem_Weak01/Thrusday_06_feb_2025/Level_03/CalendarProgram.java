package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Scanner;

public class CalendarProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Displaying the calendar for the given month and year
        printCalendar(month, year);
        
        sc.close();
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        // Get the name of the month
        String monthName = getMonthName(month);
        
        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);
        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Printing the calendar header
        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Indentation for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for indentation
        }
        
        // Print the days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();

        // Print the remaining weeks
        while(day <= daysInMonth) {
            for (int j = 0; j < 7 && day <= daysInMonth; j++) {
                System.out.printf("%3d ", day++);
            }
            System.out.println();
        }
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check if the year is a leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m <= 2) {
            m += 12;
            y--;
        }
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }
}
