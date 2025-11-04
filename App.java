import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("\nSelect Difficulty:");
        System.out.println("1. Easy (15 attempts)");
        System.out.println("2. Medium (10 attempts)");
        System.out.println("3. Hard (5 attempts)");
        System.out.print("\nEnter your choice (1-3): ");
        
        int difficulty = scanner.nextInt();
        int maxAttempts;
        
        // Set max attempts based on difficulty
        switch (difficulty) {
            case 1:
                maxAttempts = 15;
                System.out.println("\nEasy mode selected - You have 15 attempts!");
                break;
            case 2:
                maxAttempts = 10;
                System.out.println("\nMedium mode selected - You have 10 attempts!");
                break;
            case 3:
                maxAttempts = 5;
                System.out.println("\nHard mode selected - You have 5 attempts!");
                break;
            default:
                System.out.println("\nInvalid choice! Defaulting to Medium difficulty.");
                maxAttempts = 10;
                break;
        }
        
        // Generate random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasWon = false;
        
        System.out.println("\nI'm thinking of a number between 1 and 100...");
        System.out.println("Can you guess it?\n");
        
        // Game loop
        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + " - Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == targetNumber) {
                hasWon = true;
                System.out.println("\nCONGRATULATIONS! You guessed it!");
                System.out.println("The number was " + targetNumber);
                System.out.println("You won in " + attempts + " attempt(s)!");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
            
            // Show remaining attempts
            int remaining = maxAttempts - attempts;
            if (remaining > 0) {
                System.out.println("   You have " + remaining + " attempt(s) remaining.\n");
            }
        }
        
        // Game over message
        if (!hasWon) {
            System.out.println("\nGame Over! You've used all your attempts.");
            System.out.println("The number was: " + targetNumber);
            System.out.println("Better luck next time!");
        }
        
        scanner.close();
    }
}

