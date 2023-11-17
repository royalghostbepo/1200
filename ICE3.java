import java.util.InputMismatchException;
import java.util.Scanner;

public class ICE3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfValues;
        double sum = 0;
        int count = 0;

        System.out.print("How many values do you want to enter: ");
        numberOfValues = getValidInput(scanner);

        for (int i = 1; i <= numberOfValues; i++) {
            System.out.print("Enter value #" + i + ": ");

            try {
                int value = getValidInput(scanner);

                if (value < 0) {
                    System.out.println("Please enter a positive value.");
                    i--;
                    continue;
                }

                sum += value;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a numeric value.");
                scanner.next(); // Clear the invalid input from the scanner
                i--;
            } catch (NumberFormatException e) {
                System.out.println("The entered value is too large to be stored in an Integer.");
                i--;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No valid input provided to calculate average.");
        }
    }

    private static int getValidInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("The entered value is too large to be stored in an Integer, or is invalid. Please enter a valid numeric value: ");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
    }
}
