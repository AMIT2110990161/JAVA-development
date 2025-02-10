import java.util.*;
class ATM{
    static float balance;
    static int pin = 7023;
    Scanner sc = new Scanner(System.in);
    ATM(){
        System.out.print("Enter your pin : ");
        int userPin = sc.nextInt();
        if(userPin == pin){
            menu();
        }else{
            System.out.println("PIN is incorrect");
            new ATM();
        }
    }

    public void menu(){
        System.out.println("Choose accodingly ");
        System.out.println("1 for withdraw");
        System.out.println("2 for deposite");
        System.out.println("3 for pin change");
        System.out.println("4 Exit");
        int num = sc.nextInt();
        if(num == 1)withdraw();
        else if(num == 2)deposite();
        else if(num == 3)pinChange();
        else {
            System.out.println("Thank you for communicating with RAGA bank");
            return;
        }
    }

    public void withdraw(){
        System.out.print("Enter the amout you want to withdraw : ");
        float amout = sc.nextFloat();
        if(amout>balance){
            System.out.println("You dont have sufficent amount");
            System.out.println("your balence : " + balance);
        }else{
            balance -= amout;
            System.out.println("you are left with: " + balance);
            System.out.println("Thank you for communicating with RAGA bank");
        }
        menu();
    }
    public void deposite(){
        System.out.print("Enter the amout you want to deposite : ");
        float amout = sc.nextFloat();
        balance += amout;
        System.out.println("your balence : " + balance);
        System.out.println("Thank you for communicating with RAGA bank");
        menu();
    }
    public void pinChange(){
        System.out.print("Enter you current pin : ");
        int currPin = sc.nextInt();
        if(currPin == pin){
            System.out.print("Enter you new pin : ");
            int changedPin = sc.nextInt();
            pin = changedPin;
            new ATM();
        }else{
            System.out.println("PIN is incorrect");
            new ATM();
        }
    }
}

class ATMmachine{
    public static void main(String[] args){
        ATM money = new ATM();
    }
}