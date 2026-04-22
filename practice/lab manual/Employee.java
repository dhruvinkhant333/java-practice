/*
Employeeate an Employee class with private instance variables for
employeeName (String) and employeeSalary (double). Implement
public methods readEmployeeData() (to take input from the user) and
displayEmployeeData() (to print the employee's name and salary).
Demonstrate object creation and method invocation in a main method.
*/

class Employee_data{

    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = scanner.nextDouble();
    }
    public void displayEmployeeData(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}
public class Employee{
    public static void main(String[] args) {
        Employee_data employee = new Employee_data();
        employee.readEmployeeData();
        employee.displayEmployeeData();
    }
}