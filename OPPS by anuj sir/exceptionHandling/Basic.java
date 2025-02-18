package exceptionHandling;

public class Basic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Entring in the program");
        //System.out.println(arr[8]);  this will give runtime exception

        // try{
        //     System.out.println(arr[0]);
        //     int n = 2/0;
        //     System.out.println(arr[8]);
        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("pls check the index its out of bond");
        // }catch(ArithmeticException e){
        //     System.out.println(e.fillInStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println(e);
        //     System.out.println("pls dont divide any number from zero");
        // }

        try{
            System.out.println(arr[8]);
            int num = 6/0;
            int n;
        // }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
        //     System.out.println("Exeption is coming");
        // }
        
        }catch(Exception e){// this will handel all tipe of exception avilable in java this is superParent class
        
            System.out.println("Exeption is taking care of everything");
        }
        System.out.println("Exiting the program");

        // finally block

        try{
            System.out.println(arr[9]);
        // }catch(Exception e){
        //     System.out.println("Exception is caught");
        }finally{
            System.out.println("I am always going to run irrrepective of anythimg");
        }
    }    
}