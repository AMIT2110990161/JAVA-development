package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Scanner;

public class NumberChecker_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digiCount = digiCount(num);
        int[] digits = digits(num, digiCount);
        boolean checkDuckNumber = checkDuckNumber(digits);
        boolean isArmstrong = isArmstrong(digits, num);
        int[] largest = largest(digits);
        int[] smallest = smallest(digits);

        System.out.println("Count of digits : " + digiCount);
        for(int a:digits)System.out.print(a + " ");
        System.out.println();
        System.out.println("Check for dunk number : " + checkDuckNumber);
        System.out.println("Count for Armstrong number : " + isArmstrong);

        System.out.println("Larget " + largest[0] + " " + largest[1]);
        System.out.println("Smallest " + smallest[0] + " " + smallest[1]);

        sc.close();
    }

    static int digiCount(int num){
        int cnt = 0;
        while(num > 0){
            num /= 10;
            cnt++;
        }
        return cnt;
    }

    static int[] digits(int num, int digiCount){
        int[] arr = new int[digiCount];
        int idx = 0;
        while(num > 0){
            arr[idx++] = num%10;
            num /= 10;
        }
        return arr;
    }

    static boolean checkDuckNumber(int[] digits){
        for(int a:digits){
            if(a == 0)return false;
        }
        return true;
    }

    public static boolean isArmstrong(int[] digits, int number) {
        int numDigits = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }

        return sum == number;
    }

    static int[] largest(int []arr){
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > large){
                secLarge = large;
                large = arr[i];
            }else if(arr[i] > secLarge && arr[i] != large){
                secLarge = arr[i];
            }
        }
        return new int[]{large, secLarge};
    }
    
    static int[] smallest(int []arr){
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < small){
                secSmall = small;
                small = arr[i];
            }else if(arr[i] < secSmall && arr[i] != small){
                secSmall = arr[i];
            }
        }
        return new int[]{small, secSmall};
    }
}
