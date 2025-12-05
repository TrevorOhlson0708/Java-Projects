// Rock Paper Scissors Game :)
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String player = scanner.nextLine().toLowerCase();

        if (!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")) {
            System.out.println("Invalid choice! Please run the program again.");
            return;
        }

        String[] choices = {"rock", "paper", "scissors"};
        String computer = choices[random.nextInt(3)];

        System.out.println("Computer chose: " + computer);

        if (player.equals(computer)) {
            System.out.println("It's a tie!");
        }
        else if ((player.equals("rock") && computer.equals("scissors")) ||
                 (player.equals("paper") && computer.equals("rock")) ||
                 (player.equals("scissors") && computer.equals("paper"))) {
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
