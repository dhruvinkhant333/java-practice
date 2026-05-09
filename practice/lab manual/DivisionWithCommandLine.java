import java.util.Scanner;

public class DivisionWithCommandLine {
    
    public static void main(String[] args) {
        try {
            // Check if command-line arguments are provided
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide exactly 2 arguments: numerator and denominator");
            }
            
            // Parse command-line arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            
            // Perform division (will throw ArithmeticException if denominator is 0)
            int result = numerator / denominator;
            
            // Display result
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result of " + numerator + " / " + denominator + " = " + result);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Not enough arguments provided.");
            System.out.println("Usage: java DivisionWithCommandLine <numerator> <denominator>");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide valid integer values.");
            System.out.println("Usage: java DivisionWithCommandLine <numerator> <denominator>");
        } catch (ArithmeticException e) {
            System.out.println("Error: Denominator cannot be zero. Division by zero is not allowed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
