package practiceProblem_Weak01.Friday_07_feb_2025.Level_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    static Scanner sc = new Scanner(System.in);
    static int computerScore = 0;
    static int playerScore = 0;

    public static void main(String[] args) {
        gamePlay();

    }

    static void gamePlay() {

        int choice = (int) (Math.random() * 2);
        String[] computer = { "s", "p", "r" };
        String computerChoice = computer[choice];

        System.out.println("\n*********************New Game Started ********************\n");


        System.out.print("Enter your choice here (Paper -> (P or p), Rock -> (R or r), Sessiors -> (S or s)) : ");
        String player = sc.next().toLowerCase();
        if ("psr".indexOf(player) == -1) {
            System.out.println("Invalid choice pls try again later!");
            gamePlay();
        }

        if (computerChoice.equals("s") && player.equals("r") || computerChoice.equals("p") && player.equals("s")
                || computerChoice.equals("r") && player.equals("p")) {
            playerScore++;
            System.out.println("You win");
        } else if (computerChoice.equals("r") && player.equals("s") || computerChoice.equals("s") && player.equals("p")
                || computerChoice.equals("p") && player.equals("r")) {
            computerScore++;
            System.out.println("Computer wins here");
        } else {
            System.out.println("This match is draw play again as computer choice was " + computerChoice);
            gamePlay();
        }

        System.out.print("for nextGame press : 1 || to Exit press : 0  => ");
        int num = 615;
        try {
            num = sc.nextInt();
            
        } catch (InputMismatchException e) {
            try {
                num = sc.nextInt();
            } catch (Exception e) {
                
            }
            System.out.println("Exeption is called : ");

        }
        if(num == 0){
            printScore();
            return;
        }
        gamePlay();
    }

    static void printScore() {
        System.out.println("\n*********************** Final Result **************************\n");
        System.out.println("Computer Score is : " + computerScore);
        System.out.println("Your Score is : " + playerScore);
        String result = computerScore > playerScore ? "Computer" : computerScore < playerScore ? "Player" : "Draw";
        System.out.println("Final Winner : " + result);
        return;
    }
}
