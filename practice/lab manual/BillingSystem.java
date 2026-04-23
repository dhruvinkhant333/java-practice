/*
Write a program for billing system for a shopping mall. Create a class
BillGenerator that uses method overloading to generate bills based on
customer type:
generateBill(int itemTotal): For regular customers, apply no discount.
generateBill(int itemTotal, int discount): For privileged customers,
apply flat discount in rupees.
generateBill(int itemTotal, double discountPercent): For festive
offers, apply percentage discount.
Write a program to display the final bill amount using appropriate
overloaded method based on customer category.

*/

class BillGenerator {
    public void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount (Regular Customer): " + itemTotal);
    }

    public void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount (Privileged Customer): " + finalAmount);
    }

    public void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount (Festive Offer): " + finalAmount);
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        BillGenerator billGenerator = new BillGenerator();

        // Regular customer
        billGenerator.generateBill(1000);

        // Privileged customer with flat discount
        billGenerator.generateBill(1000, 200);

        // Festive offer with percentage discount
        billGenerator.generateBill(1000, 10.0);
    }
}

