public class SumFirstTenNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 10; number++) {
            sum = sum + number;
        }

        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}