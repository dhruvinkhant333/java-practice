/*
 * Question 5.1
 * Given an interface Classify with a method String getDivision(double
 * average). Implement this getDivision method in a class Result such
 * that it returns "First Division" if the average is 60 or more.
 */

// Interface Classify
interface Classify {
    String getDivision(double average);
}

// Class Result implementing Classify interface
class Result implements Classify {
    private String studentName;
    private double average;
    
    // Constructor
    public Result(String studentName, double average) {
        this.studentName = studentName;
        this.average = average;
    }
    
    // Implement getDivision method from Classify interface
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
    
    // Method to display student result
    public void displayResult() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Average Marks: " + average);
        System.out.println("Division: " + getDivision(average));
    }
}

// Main class to demonstrate the interface implementation
public class ClassifyDemo {
    public static void main(String[] args) {
        System.out.println("========== INTERFACE IMPLEMENTATION DEMO ==========\n");
        
        // Create Result objects (Result implements Classify interface)
        Result result1 = new Result("Rahul", 75.5);
        Result result2 = new Result("Priya", 65.0);
        Result result3 = new Result("Amit", 58.5);
        Result result4 = new Result("Neha", 45.0);
        Result result5 = new Result("Arjun", 35.5);
        
        // Display results
        System.out.println("1. Student 1:");
        result1.displayResult();
        System.out.println();
        
        System.out.println("2. Student 2:");
        result2.displayResult();
        System.out.println();
        
        System.out.println("3. Student 3:");
        result3.displayResult();
        System.out.println();
        
        System.out.println("4. Student 4:");
        result4.displayResult();
        System.out.println();
        
        System.out.println("5. Student 5:");
        result5.displayResult();
        System.out.println();
        
        // Using interface reference to access getDivision method
        System.out.println("========== USING INTERFACE REFERENCE ==========\n");
        Classify classify = new Result("Test Student", 62.0);
        System.out.println("Division for average 62.0: " + classify.getDivision(62.0));
        System.out.println("Division for average 48.0: " + classify.getDivision(48.0));
        System.out.println("Division for average 70.0: " + classify.getDivision(70.0));
        
        System.out.println("\n========== PROGRAM COMPLETED ==========");
    }
}
