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
        v2.displayDetails();
        System.out.println();
        
        // Demonstrate Downcasting with instanceof check
        System.out.println("========== DOWNCASTING WITH instanceof CHECK ==========\n");
        
        // Downcast v1 (which actually holds a Car object)
        if (v1 instanceof Car) {
            Car downcastCar = (Car) v1;
            System.out.println("6. Downcasted v1 to Car (verified with instanceof):");
            System.out.println("   Number of Seats: " + downcastCar.numberOfSeats);
            System.out.println("   AC Available: " + (downcastCar.ACavailable ? "Yes" : "No"));
        }
        System.out.println();
        
        // Downcast v2 (which actually holds an ElectricCar object)
        if (v2 instanceof ElectricCar) {
            ElectricCar downcastElectricCar = (ElectricCar) v2;
            System.out.println("7. Downcasted v2 to ElectricCar (verified with instanceof):");
            System.out.println("   Battery Capacity: " + downcastElectricCar.batteryCapacity + " kWh");
            System.out.println("   Charging Time: " + downcastElectricCar.chargingTime + " hours");
        }
        System.out.println();
        
        // instanceof checks to demonstrate runtime type checking
        System.out.println("========== RUNTIME TYPE CHECKING WITH instanceof ==========\n");
        Vehicle[] vehicles = { vehicle, car, electricCar, v1, v2 };
        
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Object " + (i + 1) + ":");
            if (vehicles[i] instanceof ElectricCar) {
                System.out.println("   Type: ElectricCar");
            } else if (vehicles[i] instanceof Car) {
                System.out.println("   Type: Car");
            } else if (vehicles[i] instanceof Vehicle) {
                System.out.println("   Type: Vehicle");
            }
        }
        
        System.out.println("\n========== PROGRAM COMPLETED ==========");
    }
}
