import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();

            int sum = number1 + number2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated.");
    }
}