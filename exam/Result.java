package exam;

import student.Student;

/**
 * Result class to generate student mark sheet
 * Extends Student class from student package
 * Part of exam package
 */
public class Result extends Student {
    private double marks1;
    private double marks2;
    private double marks3;
    
    /**
     * Constructor to initialize student and marks
     * @param rollNo - Roll number of the student
     * @param name - Name of the student
     * @param marks1 - First subject marks
     * @param marks2 - Second subject marks
     * @param marks3 - Third subject marks
     */
    public Result(int rollNo, String name, double marks1, double marks2, double marks3) {
        super(rollNo, name);  // Call parent class constructor
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    /**
     * Method to display student's mark sheet with total and average marks
     */
    public void displayResult() {
        System.out.println("\n========== STUDENT MARK SHEET ==========");
        
        // Display student information
        displayStudent();
        
        // Display marks
        System.out.println("Subject 1 Marks: " + marks1);
        System.out.println("Subject 2 Marks: " + marks2);
        System.out.println("Subject 3 Marks: " + marks3);
        
        // Calculate total and average marks
        double totalMarks = marks1 + marks2 + marks3;
        double averageMarks = totalMarks / 3;
        
        System.out.println("----------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("========================================\n");
    }
    
    /**
     * Main method to demonstrate mark sheet generation
     */
    public static void main(String[] args) {
        System.out.println("========== STUDENT MARK SHEET GENERATOR ==========\n");
        
        // Create first student with marks
        Result student1 = new Result(101, "Raj Kumar", 85.5, 92.0, 88.5);
        student1.displayResult();
        
        // Create second student with marks
        Result student2 = new Result(102, "Priya Sharma", 95.0, 87.5, 91.0);
        student2.displayResult();
        
        // Create third student with marks
        Result student3 = new Result(103, "Amit Patel", 78.0, 82.5, 85.5);
        student3.displayResult();
    }
}
