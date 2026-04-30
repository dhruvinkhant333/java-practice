// Base class Employee
public class Employee {
    private String name;
    private String department;
    
    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass Manager that inherits from Employee
class Manager extends Employee {
    private int teamSize;
    private String projectName;
    
    // Constructor
    public Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }
    
    // Override displayDetails() method to include manager-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

// Main class to demonstrate method overriding
class EmployeeDemo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Smith", "IT");
        
        // Create a Manager object
        Manager manager = new Manager("Sarah Johnson", "Software Development", 8, "Cloud Migration");
        
        System.out.println("=== Employee Object ===");
        employee.displayDetails();
        
        System.out.println("\n=== Manager Object ===");
        manager.displayDetails();
        
        // Demonstrating polymorphism with Employee reference
        System.out.println("\n=== Polymorphism Demonstration ===");
        Employee emp1 = new Employee("Michael Brown", "HR");
        Employee emp2 = new Manager("Emily Davis", "Finance", 5, "Budget Planning");
        
        System.out.println("\nCalling displayDetails() through Employee reference:");
        emp1.displayDetails();
        
        System.out.println("\nCalling displayDetails() through Employee reference (pointing to Manager object):");
        emp2.displayDetails();
        
        System.out.println("\n=== Runtime Polymorphism ===");
        System.out.println("emp1 calls Employee's version of displayDetails()");
        System.out.println("emp2 calls Manager's version of displayDetails() (overridden method)");
    }
}