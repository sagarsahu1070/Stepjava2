import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random r = new Random();

        String[] move = {"Rock", "Paper", "Scissor"};

        System.out.print("Enter the number of rounds: ");
        int n = in.nextInt();
        in.nextLine(); 

        int win = 0, lose = 0, draw = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nRound " + i);

            System.out.print("Enter your move (Rock, Paper, Scissor): ");
            String player = in.nextLine();

            String computer = move[r.nextInt(3)];

            System.out.println("Computer chose: " + computer);

            if (player.equalsIgnoreCase(computer)) {
                System.out.println("It's a Draw!");
                draw++;
            }
            else if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissor")) ||
                     (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                     (player.equalsIgnoreCase("Scissor") && computer.equals("Paper"))) {

                System.out.println("Player Wins!");
                win++;
            }
            else {
                System.out.println("Computer Wins!");
                lose++;
            }
        }

        System.out.println("Final Result");
        System.out.println("Player Wins : " + win);
        System.out.println("Computer Wins : " + lose);
        System.out.println("Draws : " + draw);

        if (win > lose) {
            System.out.println("Overall Winner: Player");
        } else if (lose > win) {
            System.out.println("Overall Winner: Computer");
        } else {
            System.out.println("Overall Result: Draw");
        }

        
    }
}