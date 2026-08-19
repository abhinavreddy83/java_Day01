import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("-----------------------------");

        // Loop from 1 to 10 to print the table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %d%n", number, i, (number * i));
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}