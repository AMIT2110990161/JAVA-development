package abtractionAndInterfaces;

public class AnoynamousAndFunctionalInterFace {
    public static void main(String[] args) {
        
        Parent p = new Parent(){ // Anoynamous function
            int respo = 2;
            public void printRespo(){
                System.out.println(respo);
            }
        };
    
        p.job();
            
        Worker wr = () -> { // function interface
            
        };
    }
 }
        
        
class Parent{
    void job(){
        System.out.println("I am going for work");
    }
}


interface Worker{
    void work(){
        System.out.println("wana work with us");
    }
}