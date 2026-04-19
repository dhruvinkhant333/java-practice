import java.util.Scanner;

public class CombinedProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- PART 1: Comparison Logic ---
        System.out.println("--- Comparison Section ---");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is equal to b");
        }

        System.out.println(); // Just a blank line for neatness

        // --- PART 2: Calculator Logic ---
        System.out.println("--- Calculator Section ---");
        System.out.println("Choose operation: 1(+), 2(-), 3(*), 4(/), 5(%)");
        int operator = sc.nextInt();

        switch (operator) {
            case 1: System.out.println("Result: " + (a + b)); 
            break;
            case 2: System.out.println("Result: " + (a - b)); 
            break;
            case 3: System.out.println("Result: " + (a * b)); 
            break;
            case 4: 
                if (b != 0) System.out.println("Result: " + (a / b));
                else System.out.println("Error: Div by zero");
                break;
            case 5: System.out.println("Result: " + (a % b)); 
            break;
            default: System.out.println("Invalid choice.");
        }

        


        // ----------- number - month logic ------------------
        System.out.println("--- number - month ----");
        System.out.print("enter month number : ");
       
        int number = sc.nextInt();

        switch (number) {
            case 1: System.out.println("january");
                break;
            case 2: System.out.println("february");
                break;
            case 3: System.out.println("march");
                break;
            case 4: System.out.println("april");
                break;
            case 5: System.out.println("may");
                break;
            case 6: System.out.println("june");
                break;
            case 7: System.out.println("july");
                break;
            case 8: System.out.println("august");
                break;
            case 9: System.out.println("september");
                break;
            case 10: System.out.println("octomber");
                break;
            case 11: System.out.println("november");
                break;
            case 12: System.out.println("december");
                break;

            default: System.out.println("please enter valid month number!");
                break;

            
        }
        sc.close(); // Only close the scanner at the very end

    }
}