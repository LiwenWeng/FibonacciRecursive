import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fibonacci fibonacci;
        String ordinal = "th";

        System.out.print("Enter a number(1 - 93): ");
        int num = scan.nextInt();

        if (num > 93) {
            num = 93;
        } else if (num < 1) {
            num = 1;
        }
        fibonacci = new Fibonacci(num - 1);

        if (num != 11 && num != 12 && num != 13) {
            if (num == 1 || num % 10 == 1) {
                ordinal = "st";
            } else if (num == 2 || num % 10 == 2) {
                ordinal = "nd";
            } else if (num == 3 || num % 10 == 3) {
                ordinal = "rd";
            }
        }

        System.out.println("\nThe " + num + ordinal + " fibonacci number is: " + fibonacci.getFibonacciNumberAtNth());
        System.out.println("\nThe fibonacci numbers up to the " + num + ordinal + " fibonacci number are:");
        System.out.println(Arrays.toString(fibonacci.getFibonacciNumbersUpToNth()));
    }
}