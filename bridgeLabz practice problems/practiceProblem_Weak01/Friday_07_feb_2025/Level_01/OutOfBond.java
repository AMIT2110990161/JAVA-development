package practiceProblem_Weak01.Friday_07_feb_2025.Level_01;

public class OutOfBond {
    public static void main(String[] args) {
        String str = "Amit";

        try {
            try{
                System.out.println(str.charAt(5));
            }catch(StringIndexOutOfBoundsException e){
                System.out.println(str + " have character " + str.length());
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
