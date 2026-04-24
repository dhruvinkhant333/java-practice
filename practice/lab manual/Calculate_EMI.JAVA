/* 
2.8

A bank wants to offer a facility to calculate EMI (Equated Monthly
Installment) for different types of loans. Design a class
LoanCalculator with the following overloaded methods:
calculateEMI(int principal, int time, float rate): For home loans
calculateEMI(double principal, int time, double rate): For vehicle
loans
calculateEMI(int principal, int time): For short-term personal loans
with a fixed interest rate of 10%
Demonstrate the use of all three methods in the main method by
calculating EMIs for different loan types.
*/

class LoanCalculator {
    public void calculateEMI(int principal, int time, float rate) {
        double monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, time)) / (Math.pow(1 + monthlyRate, time) - 1);
        System.out.println("EMI for Home Loan: " + emi);
    }

    public void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, time)) / (Math.pow(1 + monthlyRate, time) - 1);
        System.out.println("EMI for Vehicle Loan: " + emi);
    }

    public void calculateEMI(int principal, int time) {
        float fixedRate = 10.0f;
        double monthlyRate = fixedRate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, time)) / (Math.pow(1 + monthlyRate, time) - 1);
        System.out.println("EMI for Personal Loan: " + emi);
    }
}

public class Calculate_EMI {
    public static void main(String[] args) {
        LoanCalculator loanCalculator = new LoanCalculator();

        // Calculate EMI for home loan
        loanCalculator.calculateEMI(500000, 60, 7.5f);

        // Calculate EMI for vehicle loan
        loanCalculator.calculateEMI(300000, 48, 8.0);

        // Calculate EMI for personal loan
        loanCalculator.calculateEMI(200000, 24);
    }
}