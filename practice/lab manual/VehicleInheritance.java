// Base class Vehicle
class Vehicle {
    // Protected access specifier for inherited members
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;
    
    // Constructor to initialize Vehicle attributes
    public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }
    
    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("=== Vehicle Details ===");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car derived from Vehicle
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;
    
    // Constructor with constructor chaining using super keyword
    public Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);  // Invoke parent class constructor
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }
    
    // Override displayDetails() method
    @Override
    public void displayDetails() {
        super.displayDetails();  // Invoke parent class method using super keyword
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + (ACavailable ? "Yes" : "No"));
    }
}

// Subclass ElectricCar derived from Car
class ElectricCar extends Car {
    private double batteryCapacity;  // in kWh
    private double chargingTime;     // in hours
    
    // Constructor with constructor chaining
    public ElectricCar(String vehicleNumber, String brand, String fuelType, 
                       int numberOfSeats, boolean ACavailable, 
                       double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);  // Invoke parent class constructor
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    
    // Override displayDetails() method
    @Override
    public void displayDetails() {
        super.displayDetails();  // Invoke parent class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Main class to demonstrate the program
public class VehicleInheritance {
    public static void main(String[] args) {
        System.out.println("========== VEHICLE INHERITANCE DEMONSTRATION ==========\n");
        
        // Create objects of all three classes
        Vehicle vehicle = new Vehicle("VEH001", "Toyota", "Petrol");
        Car car = new Car("CAR001", "Honda", "Diesel", 5, true);
        ElectricCar electricCar = new ElectricCar("ECAR001", "Tesla", "Electric", 5, true, 100.0, 8.5);
        
        // Display details using overridden methods
        System.out.println("1. Vehicle Object:");
        vehicle.displayDetails();
        System.out.println();
        
        System.out.println("2. Car Object:");
        car.displayDetails();
        System.out.println();
        
        System.out.println("3. ElectricCar Object:");
        electricCar.displayDetails();
        System.out.println();
        
        // Demonstrate Upcasting (implicit conversion of subclass to parent class)
        System.out.println("========== UPCASTING DEMONSTRATION ==========\n");
        Vehicle v1 = new Car("CAR002", "Maruti", "Petrol", 4, false);
        Vehicle v2 = new ElectricCar("ECAR002", "BMW", "Electric", 4, true, 85.0, 7.0);
        
        System.out.println("4. Upcasted Car Object:");
        v1.displayDetails();
        System.out.println();
        
        System.out.println("5. Upcasted ElectricCar Object:");
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
