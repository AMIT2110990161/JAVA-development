package Level_02;

import java.util.Scanner;

public class MovieTicket {
    private String movieName = "Raja Hindusthani";
    private int seatNumber;
    private float price1 = 500;
    private float price2 = 750;
    Scanner sc = new Scanner(System.in);
    
    void bookTicket(int num){
        System.out.println("Pls make your Payement for movie : " + num);
        int money = sc.nextInt();
        if(money == 0)return;
        
        if(num == 1){
            if(money >= price1){
                seatNumber = (int) (Math.random()*100)+1;
                System.out.println("Amout left : " + (money-price1));
                ticketDetail(num);
            }else {
                System.out.println("Amout is insufficient");
                System.out.println("----------------Press '0' to Exit--------------");
                bookTicket(num);
            }
        }else{
            if(money >= price2){
                seatNumber = (int) (Math.random()*100)+1;
                System.out.println("Amout left : " + (money-price2));
                ticketDetail(num);
            }else {
                System.out.println("Amout is insufficient");
                System.out.println("----------------Press '0' to Exit--------------");
                bookTicket(num);
            }
        }
    }
    
    void ticketDetail(int num){
        System.out.println("----------------Movie Details--------------");
        System.out.println("Your seat Number is : " + seatNumber + " for " + movieName + " Movie in hall " +  num);
    }

    public static void main(String[] args) {
        MovieTicket mb = new MovieTicket();
        mb.bookTicket(2);
    }
}
