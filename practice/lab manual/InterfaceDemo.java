// What is an interface? A contract that defines abstract methods without implementation
interface Exam {
    // Why does this method declaration not have a body? Because interface methods are abstract by default
    boolean isPassed(int mark);
}

// What is the difference between multiple interfaces? A class can implement multiple interfaces to fulfill multiple contracts
interface Classify {
    // What does this method do? Returns the division/grade based on average marks
    String getDivision(double average);
}

// What does implements keyword do? It means Result class must provide concrete implementations of all abstract methods
class Result implements Exam, Classify {
    
    private int mark;
    private double average;
    
    // Constructor to initialize mark and average
    public Result(int mark, double average) {
        this.mark = mark;
        this.average = average;
    }
    
    // Why do we override this method? To provide concrete implementation for the Exam interface
    @Override
    public boolean isPassed(int mark) {
        // What is the passing criteria? Mark should be 40 or more to pass
        return mark >= 40;
    }
    
    // Why do we override this method? To provide concrete implementation for the Classify interface
    @Override
    public String getDivision(double average) {
        // What logic determines the division? Based on percentage average
        if (average >= 80) {
            return "Distinction";
        } else if (average >= 60) {
            return "First Class";
        } else if (average >= 50) {
            return "Second Class";
        } else if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    
    // Helper method to get mark
    public int getMark() {
        return this.mark;
    }
    
    // Helper method to get average
    public double getAverage() {
        return this.average;
    }
    
    // Helper method to set mark
    public void setMark(int mark) {
        this.mark = mark;
    }
    
    // Helper method to set average
    public void setAverage(double average) {
        this.average = average;
    }
}

public class InterfaceDemo {
    
    public static void main(String[] args) {
        
        System.out.println("========== INTERFACE IMPLEMENTATION DEMONSTRATION ==========\n");
        
        // Why create Result instance? To demonstrate concrete implementations of both interfaces
        Result result1 = new Result(75, 72.5);
        
        System.out.println("Student 1 Details:");
        System.out.println("Mark: " + result1.getMark());
        System.out.println("Average: " + result1.getAverage());
        
        // What does isPassed() check? Whether the student has passed with the given mark
        System.out.println("Passed (Exam Interface): " + result1.isPassed(result1.getMark()));
        
        // What does getDivision() return? The division/grade based on average percentage
        System.out.println("Division (Classify Interface): " + result1.getDivision(result1.getAverage()));
        System.out.println();
        
        // Second student with different marks
        System.out.println("Student 2 Details:");
        Result result2 = new Result(35, 38.5);
        System.out.println("Mark: " + result2.getMark());
        System.out.println("Average: " + result2.getAverage());
        System.out.println("Passed (Exam Interface): " + result2.isPassed(result2.getMark()));
        System.out.println("Division (Classify Interface): " + result2.getDivision(result2.getAverage()));
        System.out.println();
        
        // Third student with excellent marks
        System.out.println("Student 3 Details:");
        Result result3 = new Result(95, 85.0);
        System.out.println("Mark: " + result3.getMark());
        System.out.println("Average: " + result3.getAverage());
        System.out.println("Passed (Exam Interface): " + result3.isPassed(result3.getMark()));
        System.out.println("Division (Classify Interface): " + result3.getDivision(result3.getAverage()));
        System.out.println();
        
        // Demonstrate using interface references
        System.out.println("========== USING INTERFACE REFERENCES ==========\n");
        
        // Why can we assign Result object to Exam reference? Because Result implements Exam interface
        Exam examResult = new Result(55, 60.0);
        System.out.println("Using Exam interface reference:");
        System.out.println("Passed: " + examResult.isPassed(55));
        System.out.println();
        
        // Why can we assign Result object to Classify reference? Because Result implements Classify interface
        Classify classifyResult = new Result(88, 82.5);
        System.out.println("Using Classify interface reference:");
        System.out.println("Division: " + classifyResult.getDivision(82.5));
        System.out.println();
        
        // Demonstrate multiple interface references with same object
        System.out.println("========== MULTIPLE INTERFACE IMPLEMENTATION ==========\n");
        Result student = new Result(65, 68.0);
        
        Exam examCheck = student;
        Classify divisionCheck = student;
        
        System.out.println("Student Mark: " + student.getMark());
        System.out.println("Student Average: " + student.getAverage());
        System.out.println("Passed (via Exam interface): " + examCheck.isPassed(student.getMark()));
        System.out.println("Division (via Classify interface): " + divisionCheck.getDivision(student.getAverage()));
        System.out.println();
        
        System.out.println("========== PASSING CRITERIA & DIVISION GRADES ==========");
        System.out.println("Passing Mark: >= 40");
        System.out.println("Distinction: >= 80%");
        System.out.println("First Class: >= 60%");
        System.out.println("Second Class: >= 50%");
        System.out.println("Pass: >= 40%");
        System.out.println("Fail: < 40%");
        System.out.println();
        System.out.println("========== PROGRAM COMPLETED ==========");
    }
}
