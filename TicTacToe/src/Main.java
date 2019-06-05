import java.util.Scanner;

public class Main {

    public static void main(String []args){
        boolean repeat = true;
        while(repeat) {
            String again;
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to play yes or no?");
            again = input.next();
            if (again.equalsIgnoreCase("yes")) {
                TicTacToe.playTicTacToe();

            } else {
                System.out.println("Thanks for playing");
                System.exit(0);
                repeat = false;
            }
        }
        }
    }

