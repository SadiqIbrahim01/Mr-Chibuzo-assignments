import java.util.Scanner;

public class TempSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close();
    }
}