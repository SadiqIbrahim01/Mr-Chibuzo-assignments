public class Kata {

1. public static boolean isEven(int integer) {
    return integer % 2 == 0;
    }

2.  public static boolean isPrimeNumber(int integer) {
    if return integer % 1 == integer;
    else if return integer % integer == 1; 
    }

3.  public static int positiveDifference(int a, int b) {
    return Math.abs(a - b);
    }

4.  public static boolean isPrimeNumber(int integer) {
    if (integer <= 1) {
    return false;
    }
    for (i = 2; i <= Math.sqrt(integer); i++) {
    if (integer % i == 0) {
    return false;
    } 
    } else {
    return true;
    }

5. public static int Factors(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            count++;
    }
    }
    return count;
    }

6.  public static boolean isSquare(int number) {
    if (number < 0) return false;
    int sqrt = (int) Math.sqrt(number);
    return sqrt * sqrt == number;
    }

7.  public static boolean isPalindrome(int number) {
    

    }


8.  public static long factorial(int number) {

    }

9.  public static int square(int number) {
    return number * number;
    }


}