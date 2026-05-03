import java.util.Scanner;

// What is the purpose of exception handling? To manage runtime errors gracefully without crashing the program
public class DivisionWithExceptionHandling {
    
    public static void main(String[] args) {
        
        // Method 1: Using command-line arguments
        System.out.println("=== Method 1: Using Command-Line Arguments ===");
        performDivisionWithArgs(args);
        
        // Method 2: Using Scanner for user input
        System.out.println("\n=== Method 2: Using Scanner Input ===");
        performDivisionWithScanner();
    }
    
    // Why do we need this method? To handle division from command-line arguments with exception handling
    public static void performDivisionWithArgs(String[] args) {
        
        try {
            
            // What exception can occur here? ArrayIndexOutOfBoundsException if less than 2 arguments provided
            if (args.length < 2) {
                System.out.println("Error: Please provide two command-line arguments");
                System.out.println("Usage: java DivisionWithExceptionHandling <numerator> <denominator>");
                return;
            }
            
            // What exception can occur here? NumberFormatException if arguments are not valid integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            
            // What exception can occur here? ArithmeticException when denominator is zero
            int result = numerator / denominator;
            
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // What is this catch block for? To handle missing command-line arguments
            System.out.println("Error: Insufficient arguments provided");
            System.out.println("Please provide exactly 2 arguments: numerator and denominator");
            
        } catch (NumberFormatException e) {
            // What is this catch block for? To handle non-integer input
            System.out.println("Error: Invalid input format");
            System.out.println("Please provide valid integers as arguments");
            System.out.println("Details: " + e.getMessage());
            
        } catch (ArithmeticException e) {
            // What is this catch block for? To handle division by zero
            System.out.println("Error: Division by zero is not allowed");
            System.out.println("Details: " + e.getMessage());
            
        } catch (Exception e) {
            // Why do we need this generic catch block? To handle any unexpected exceptions
            System.out.println("Error: An unexpected error occurred");
            System.out.println("Details: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Why do we need this method? To provide an alternative way to get input with exception handling
    public static void performDivisionWithScanner() {
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.print("Enter numerator: ");
            // What exception can occur here? InputMismatchException if non-integer is entered
            int numerator = scanner.nextInt();
            
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            
            // What exception can occur here? ArithmeticException when denominator is zero
            int result = numerator / denominator;
            
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
            
        } catch (java.util.InputMismatchException e) {
            // What is this catch block for? To handle non-integer input from scanner
            System.out.println("Error: Please enter valid integers");
            System.out.println("Details: " + e.getMessage());
            
        } catch (ArithmeticException e) {
            // What is this catch block for? To handle division by zero
            System.out.println("Error: Cannot divide by zero");
            System.out.println("Details: " + e.getMessage());
            
        } catch (Exception e) {
            // Why do we need this generic catch block? To catch any other unexpected errors
            System.out.println("Error: An error occurred");
            System.out.println("Details: " + e.getMessage());
            
        } finally {
            // What is the finally block for? To execute cleanup code regardless of exception
            scanner.close();
            System.out.println("Scanner closed successfully");
        }
    }
}
