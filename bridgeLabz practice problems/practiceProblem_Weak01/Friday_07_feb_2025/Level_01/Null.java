package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

public class Null {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("there is an Exception");
        }
    }
}
