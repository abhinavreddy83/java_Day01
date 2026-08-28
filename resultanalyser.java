import java.util.Scanner;

public class resultAnalyser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for student's name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Ask for marks
        System.out.print("Enter marks in Subject 1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double mark3 = sc.nextDouble();

        // Calculate total and average
        double total = mark1 + mark2 + mark3;
        double average = total / 3;

        // Check pass
        boolean passed = mark1 >= 40 && mark2 >= 40 && mark3 >= 40;

        // Check distinction
        boolean distinction = passed && average >= 75;

        // Check special award
        boolean specialAward = passed && average >= 90
                && mark1 >= 80 && mark2 >= 80 && mark3 >= 80;

        // Display result
        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (passed) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        if (distinction) {
            System.out.println("Distinction: YES");
        } else {
            System.out.println("Distinction: NO");
        }

        if (specialAward) {
            System.out.println("Special Award: YES");
        } else {
            System.out.println("Special Award: NO");
        }

        sc.close();
    }
}