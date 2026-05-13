/*
Simulate a simple ATM or cashier. Given an integer amount to be
dispensed (e.g., 787), calculate and display the minimum number of
currency notes of denominations 100, 50, 10, 5, 2, and 1 that would be
given to the user.
*/

import java.util.Scanner;

public class code_Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to be dispensed: ");
        int amount = scanner.nextInt();

        int[] denominations = {100, 50, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            count[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Currency notes dispensed:");
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + " x " + count[i]);
            }
        }

        scanner.close();
    }
    
}
