public class BankAccount {
    
    private double balance;
    
    /**
     * Constructor to initialize the bank account with initial balance of 1000.00
     */
    public BankAccount() {
        this.balance = 1000.00;
        System.out.println("Account created with initial balance: $" + String.format("%.2f", balance));
    }
    
    /**
     * Method to deposit money to the account
     * @param amount The amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: $" + String.format("%.2f", amount));
            displayBalance();
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
    
    /**
     * Method to withdraw money from the account
     * @param amount The amount to withdraw
     * @throws NotSufficientFundException if withdrawal amount exceeds available balance
     */
    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful: $" + String.format("%.2f", amount));
            displayBalance();
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }
    
    /**
     * Method to display the current balance
     */
    public void displayBalance() {
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
    }
    
    /**
     * Method to get the current balance
     * @return The current balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Main method to test the Banking Application
     */
    public static void main(String[] args) {
        System.out.println("=== Banking Application ===\n");
        
        // Create a bank account (initialized with 1000.00)
        BankAccount account = new BankAccount();
        System.out.println();
        
        // Deposit 1000.00
        try {
            System.out.println("--- Deposit Operation ---");
            account.deposit(1000.00);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // First withdrawal: 400.00
        try {
            System.out.println("--- Withdrawal 1: $400.00 ---");
            account.withdraw(400.00);
            System.out.println();
        } catch (NotSufficientFundException e) {
            System.out.println("Withdrawal failed - " + e.getMessage());
            System.out.println();
        }
        
        // Second withdrawal: 300.00
        try {
            System.out.println("--- Withdrawal 2: $300.00 ---");
            account.withdraw(300.00);
            System.out.println();
        } catch (NotSufficientFundException e) {
            System.out.println("Withdrawal failed - " + e.getMessage());
            System.out.println();
        }
        
        // Third withdrawal: 500.00 (This will throw exception)
        try {
            System.out.println("--- Withdrawal 3: $500.00 ---");
            account.withdraw(500.00);
            System.out.println();
        } catch (NotSufficientFundException e) {
            System.out.println("Withdrawal failed - " + e.getMessage());
            System.out.println("Remaining Balance: $" + String.format("%.2f", account.getBalance()));
            System.out.println();
        }
        
        // Display final balance
        System.out.println("=== Final Account Status ===");
        account.displayBalance();
    }
}
