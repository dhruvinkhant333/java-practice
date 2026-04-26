/*3.4

Create a Java method is ValidPassword(String password) that checks if
a given string is a valid password based on the following rules:
· It must have at least eight characters.
. It must consist only of letters and digits.
· It must contain at least two digits.

The program should prompt the user to enter a password and display
"Valid Password" or "Invalid Password" accordingly.
*/

import java.util.Scanner;
public class Password_validator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}
