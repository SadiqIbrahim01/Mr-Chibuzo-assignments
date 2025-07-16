import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positives);
        System.out.println("Count of negative numbers: " + negatives);
        System.out.println("Count of zeros: " + zeros);
    }
}