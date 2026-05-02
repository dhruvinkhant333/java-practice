package student;

/**
 * Student class to store student information
 * Part of student package
 */
public class Student {
    protected int rollNo;
    protected String name;
    
    /**
     * Constructor to initialize student details
     * @param rollNo - Roll number of the student
     * @param name - Name of the student
     */
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    
    /**
     * Method to display student information
     */
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
