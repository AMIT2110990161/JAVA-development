package practiceProblem_Weak01.Monday_03_feb_2025.Level_02;

public class AllOtherPrograms {
    public static void main(String[] args) {
        // 1. Area of Triangle
        double base = 5.0; // Example base
        double height = 10.0; // Example height
        double areaInches2 = 0.5 * base * height;
        double areaCm2 = areaInches2 * 6.4516; // 1 square inch = 6.4516 square cm
        System.out.println("The area of the triangle is " + areaInches2 + " square inches and " + areaCm2 + " square centimeters.");
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // 2. Side of Square from Perimeter
        double perimeter = 16.0; // Example perimeter
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // 3. Convert Distance in Feet to Yards and Miles
        double feet = 120.0; // Example distance in feet
        double yards = feet / 3;
        double miles = yards / 1760; // 1 mile = 1760 yards
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // 4. Total Price of Purchase
        double unitPrice = 500.0; // Example unit price
        int quantity = 5; // Example quantity
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // 5. Quotient and Remainder of Two Numbers
        int number1 = 20; // Example number
        int number2 = 6;  // Example number
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // 6. Integer Operations (a, b, c as input)
        int a = 5, b = 3, c = 2;
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;
        System.out.println("The results of Integer Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // 7. Double Operations (a, b, c as input)
        double da = 5.5, db = 3.0, dc = 2.5;
        double operation1d = da + db * dc;
        double operation2d = da * db + dc;
        double operation3d = dc + da / db;
        double operation4d = da % db + dc; // Remainder in double is not common, but still handled
        System.out.println("The results of Double Operations are " + operation1d + ", " + operation2d + ", " + operation3d + ", and " + operation4d);
        System.out.println("---------------Next Program-------------------");
        System.out.println();
    
    }
}
