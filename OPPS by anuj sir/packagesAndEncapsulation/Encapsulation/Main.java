package packagesAndEncapsulation.Encapsulation;

public class Main {
    private int pin = 7023;

    String getData(int pin){
        if(this.pin == pin)return "You have access";
        else return "Wrong pin";
    }
    
}

