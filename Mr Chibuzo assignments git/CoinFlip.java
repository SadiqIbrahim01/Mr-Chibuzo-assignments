import java.util.Scanner;

   public class CoinFlip {
   public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  System.out.println("Enter 0 or 1 to guess which is Heads or Tail"); 
  int coinFlip = (int) (Math.random() * 2);
   
   System.out.print("Enter your guess: ");
   int guess = input.nextInt();
   
   System.out.println("You entered: " + guess);

  if (guess != 0 && guess != 1) {
  System.out.println("Invalid guess");
}
  else {
  System.out.println("The coin landed on " + coinFlip);
}

 if (guess == coinFlip) {
 System.out.println("Your guess is correct.");
}
 else {
 System.out.println("Your guess is incorrect.");
}

}
 
}