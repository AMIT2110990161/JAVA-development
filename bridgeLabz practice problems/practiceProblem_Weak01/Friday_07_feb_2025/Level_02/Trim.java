package practiceProblem_Weak01.Friday_07_feb_2025.Level_02;

public class Trim {
    public static void main(String[] args) {
        String str = " amit   ";
        boolean check = str.charAt(0) == ' ' ? true : false;
        for(char ch : str.toCharArray()){
            while(check){
                if(ch != ' ')check = false;
            }
        }
    }
}
