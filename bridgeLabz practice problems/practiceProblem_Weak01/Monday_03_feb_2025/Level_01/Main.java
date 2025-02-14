package practiceProblem_Weak01.Monday_03_feb_2025.Level_01;

public class Main {
    public static void main(String[] args) {

        // Harry's Age
        int birthYear = 2000;
        int currYear = 2024;
        System.out.println("Harry Age : " + (currYear - birthYear));
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Sam's average marks
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int averageMarks = (maths + physics + chemistry) / 3;
        System.out.println("Sam's average mark in PCM is : " + averageMarks);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Convert distance of 10.8 kilometers to miles
        float distanceKilometers = 10.8f;
        System.out.println("The distance " + distanceKilometers + " km in miles is " + (distanceKilometers * 1.6));
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Profit and loss based on cost price INR 129 and selling price INR 191
        int costPrice = 129;
        int sellPrice = 191;
        int profit = sellPrice - costPrice;
        float profitPercentage = ((float) profit / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Pen distribution
        int penNum = 14;
        int studentNum = 3;
        System.out.println("The Pen Per Student is " + (penNum / studentNum) + " and the remaining pen not distributed is " + (penNum % studentNum));
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Calculate final fees
        int originalFee = 125000;
        int discountPercentage = 10;
        float discount = ((float) discountPercentage / 100) * originalFee;
        int payableFee = originalFee - (int) discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + payableFee);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Compute Volume of Earth
        double radius = 6378;
        double pi = 3.14159265359;
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        double volumeMile3 = volumeKm3 * 0.239913;
        
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " km^3");
        System.out.println("The volume of Earth in cubic miles is " + volumeMile3 + " miles^3");
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Convert Kilometers to Miles
        double km = 10;
        double miles = km / 1.6; 
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Compute Student Fee after Discount
        double studentFee = 50000;
        double discountPercent = 15; 
        
        double discountAmount = (discountPercent / 100) * studentFee;
        double finalFee = studentFee - discountAmount;
        
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Convert Height in Centimeters to Feet and Inches
        double cm = 170; 
        
        double inches = cm / 2.54; 
        int feet = (int) (inches / 12); 
        inches = inches % 12;
        
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " feet and inches is " + inches + " inches");
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Basic Calculator
        double number1 = 12.5; 
        double number2 = 3.5; 
        
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? number1 / number2 : 0; 
        
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Calculate Area of a Triangle
        double base = 5; 
        double height = 10; 
        
        double areaInches2 = 0.5 * base * height;
        double areaCm2 = areaInches2 * 6.4; 
        
        System.out.println("The area of the triangle is " + areaInches2 + " square inches and " + areaCm2 + " square centimeters.");
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Calculate Side of Square from Perimeter
        double perimeter = 16; 
        
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Convert Distance in Feet to Yards and Miles
        double feetDistance = 120; 
        
        double yards = feetDistance / 3;
        double milesFromFeet = yards / 1760;
        
        System.out.println("The distance in yards is " + yards + " and in miles is " + milesFromFeet);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Calculate Total Price of Purchase
        double unitPrice = 500; 
        int quantity = 5;
        
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        System.out.println("---------------Next Program-------------------");
        System.out.println();

        // Maximum Number of Handshakes among N Students
        int numberOfStudents = 10;
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
