package Level_02;

public class PalindromeChecker {

    static boolean isPalindrome(String str){
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length/2; i++){
            if(ch[i] != ch[ch.length-1-i])return false;
        }
        return true;
    }

    public static void main(String[] args) {
       boolean check = PalindromeChecker.isPalindrome("aamama");
        System.out.println(check);
    }
}
