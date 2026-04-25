/*
3.2

Design a class BankAccount with account_holder_name and balance.
Use a static variable interest_rate (same for all accounts). Include
methods to calculate and display the interest earned. Update interest
rate using a static method.
*/

class BankAccount {
    String accountHolderName;
    double balance;
    static double interestRate;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void calculateInterest() {
        double interestEarned = balance * (interestRate / 100);
        System.out.println("Interest earned for " + accountHolderName + ": " + interestEarned);
    }
}

public class BankBalance_with_interest {
    public static void main(String[] args) {
        BankAccount.setInterestRate(5.0); // Set interest rate to 5%

        BankAccount account1 = new BankAccount("Alice", 10000);
        BankAccount account2 = new BankAccount("Bob", 20000);

        account1.calculateInterest();
        account2.calculateInterest();
    }
}