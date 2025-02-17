package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.*;

public class OTP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] otp = new int[10];
        for(int i=0; i<otp.length; i++){
            otp[i] = (int)((Math.random()*900000)+100000);
        }
        boolean check =  isUnique(otp);
        if(check)System.out.println("This array have unique OTP's");
        else System.out.println("This array don't have unique OTP's");
        for (int i : otp) {
            System.out.print(i +" ");
        }
        sc.close();
    }
    static boolean isUnique(int[] otp){
        HashSet<Integer> hs = new HashSet<>();
        for(int a:otp)hs.add(a);
        System.out.println(hs);
        return hs.size() == 10;
    }
}
