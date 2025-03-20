package abtractionAndInterfaces;

public class AnoynamousAndFunctionalInterFace {
    public static void main(String[] args) {
        
        Parent p = new Parent(){ // Anoynamous function
            
        };
    
        p.job();
            
        Worker wr = (int num) -> { // function interface
            System.out.println("I am worker");
            return num;
        };
        wr.counter(5);

        Worker obj = (int n) -> n*2;
        System.out.println(obj.counter(2));
    }
 }
        
        
class Parent{
    void job(){
        System.out.println("I am going for work");
    }
}


interface Worker{
    int counter(int num);
}