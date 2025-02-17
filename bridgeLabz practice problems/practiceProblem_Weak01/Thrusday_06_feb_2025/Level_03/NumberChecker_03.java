package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Scanner;

public class NumberChecker_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digiCount = digiCount(num);
        int[] digits = digits(num, digiCount);
        int totalSum = totalSum(digits);
        int totalSumOfSquare = totalSumOfSquare(digits);
        boolean isHarsadh = isHarsadh(num, totalSum);
        
        System.out.println("Count of digits : " + digiCount);
        for(int a:digits)System.out.print(a + " ");
        System.out.println();
        System.out.println("Total sum of array Elements : " + totalSum);
        System.out.println("Total sum Square of array Elements : " + totalSumOfSquare);
        System.out.println("check if number is harsadh or not : " + isHarsadh);
        frequancy(digits, digiCount);

        sc.close();
    }

    static void frequancy(int[] digits, int digiCount){
        int[][] arr = new int[2][digiCount];
        int[] nums = new int[10];
        for(int a:digits){
            nums[a]++;
        }
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                arr[0][idx] = i;
                arr[1][idx] = nums[i];
                idx++;
            }
        }

        for(int i=0; i<arr[0].length; i++){
            if(arr[1][i] == 0)break;
            System.out.println(arr[0][i] + " is having frquancy of " + arr[1][i]);
        }
    }

    static boolean isHarsadh(int num, int totalSum){
        return num%totalSum == 0;
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

    static int totalSum(int[] digits){
        int sum = 0;
        for(int a:digits)sum += a;
        return sum;
    }

    static int totalSumOfSquare(int[] digits){
        int sum = 0;
        for(int a:digits)sum += a*a;
        return sum;
    }

}
