import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; 
        int guess;

        System.out.println("Guess a number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number.");
    }
}