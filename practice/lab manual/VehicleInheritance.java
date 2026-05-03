/**
 * Question 5.4.6: Abstract Class Vehicle
 * Program to demonstrate abstract classes and methods
 * with Car and Bike subclasses
 */

// Abstract class Vehicle
abstract class Vehicle {
    protected String name;
    
    // Constructor
    public Vehicle(String name) {
        this.name = name;
    }
    
    // Abstract method for fuel type
    abstract String fuelType();
    
    // Abstract method for number of wheels
    abstract int noOfWheels();
    
    // Concrete method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle: " + name);
        System.out.println("Fuel Type: " + fuelType());
        System.out.println("Number of Wheels: " + noOfWheels());
        System.out.println();
    }
}

// Concrete subclass Car
class Car extends Vehicle {
    
    public Car(String name) {
        super(name);
    }
    
    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }
    
    @Override
    int noOfWheels() {
        return 4;
    }
}

// Concrete subclass Bike
class Bike extends Vehicle {
    
    public Bike(String name) {
        super(name);
    }
    
    @Override
    String fuelType() {
        return "Petrol";
    }
    
    @Override
    int noOfWheels() {
        return 2;
    }
}

// Main class to demonstrate the program
public class VehicleInheritance {
    public static void main(String[] args) {
        System.out.println("========== ABSTRACT CLASS - VEHICLE DEMONSTRATION ==========\n");
        
        // Create objects of Car and Bike subclasses
        Vehicle car = new Car("Toyota Fortuner");
        Vehicle bike = new Bike("Hero Honda");
        
        // Display information for Car
        System.out.println("1. Car Information:");
        car.displayInfo();
        
        // Display information for Bike
        System.out.println("2. Bike Information:");
        bike.displayInfo();
        
        // Additional examples
        System.out.println("3. Additional Examples:");
        Vehicle car2 = new Car("Maruti Swift");
        Vehicle bike2 = new Bike("Bajaj Pulsar");
        
        car2.displayInfo();
        bike2.displayInfo();
        
        // Demonstrate Downcasting with instanceof check
        System.out.println("========== DOWNCASTING WITH instanceof CHECK ==========\n");
        
        // Downcast car (which actually holds a Car object)
        if (car instanceof Car) {
            Car downcastCar = (Car) car;
            System.out.println("4. Downcasted car to Car (verified with instanceof):");
            System.out.println("   Confirmed as Car object successfully");
        }
        System.out.println();
        
        // Downcast bike (which actually holds a Bike object)
        if (bike instanceof Bike) {
            Bike downcastBike = (Bike) bike;
            System.out.println("5. Downcasted bike to Bike (verified with instanceof):");
            System.out.println("   Confirmed as Bike object successfully");
        }
        System.out.println();
        
        // instanceof checks to demonstrate runtime type checking
        System.out.println("========== RUNTIME TYPE CHECKING WITH instanceof ==========\n");
        Vehicle[] vehicles = { car, bike, car2, bike2 };
        
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Object " + (i + 1) + ": " + vehicles[i].name);
            if (vehicles[i] instanceof Car) {
                System.out.println("   Type: Car");
                System.out.println("   Wheels: " + vehicles[i].noOfWheels());
                System.out.println("   Fuel: " + vehicles[i].fuelType());
            } else if (vehicles[i] instanceof Bike) {
                System.out.println("   Type: Bike");
                System.out.println("   Wheels: " + vehicles[i].noOfWheels());
                System.out.println("   Fuel: " + vehicles[i].fuelType());
            }
        }
        
        System.out.println("\n========== PROGRAM COMPLETED ==========");
    }
}
