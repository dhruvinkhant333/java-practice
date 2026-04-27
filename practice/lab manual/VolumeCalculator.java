/**
 * Program to demonstrate Method Overloading
 * Calculates volume of different 3D shapes using overloaded calculateVolume() methods
 * Problem 3.5
 */

public class VolumeCalculator {
    
    /**
     * Overloaded method 1: Calculate volume of a Cube
     * Formula: V = side³
     * @param side the length of one side of the cube
     * @return volume of the cube
     */
    public static double calculateVolume(double side) {
        return side * side * side;
    }
    
    /**
     * Overloaded method 2: Calculate volume of a Rectangular Cube (Cuboid/Box)
     * Formula: V = length × width × height
     * @param length the length of the rectangular cube
     * @param width the width of the rectangular cube
     * @param height the height of the rectangular cube
     * @return volume of the rectangular cube
     */
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    /**
     * Overloaded method 3: Calculate volume of a Sphere
     * Formula: V = (4/3)πr³
     * @param radius the radius of the sphere
     * @return volume of the sphere
     */
    public static double calculateVolume(double radius, String shape) {
        if (shape.equalsIgnoreCase("sphere")) {
            return (4.0 / 3.0) * Math.PI * radius * radius * radius;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Volume Calculator - Method Overloading");
        System.out.println("========================================\n");
        
        // Test 1: Calculate volume of a Cube
        double cubeSide = 5.0;
        double cubeVolume = calculateVolume(cubeSide);
        System.out.println("1. CUBE:");
        System.out.println("   Side length: " + cubeSide + " units");
        System.out.println("   Formula: V = side³");
        System.out.println("   Volume: " + String.format("%.2f", cubeVolume) + " cubic units\n");
        
        // Test 2: Calculate volume of a Rectangular Cube
        double length = 8.0;
        double width = 6.0;
        double height = 4.0;
        double boxVolume = calculateVolume(length, width, height);
        System.out.println("2. RECTANGULAR CUBE (CUBOID/BOX):");
        System.out.println("   Length: " + length + " units");
        System.out.println("   Width: " + width + " units");
        System.out.println("   Height: " + height + " units");
        System.out.println("   Formula: V = length × width × height");
        System.out.println("   Volume: " + String.format("%.2f", boxVolume) + " cubic units\n");
        
        // Test 3: Calculate volume of a Sphere
        double radius = 3.0;
        double sphereVolume = calculateVolume(radius, "sphere");
        System.out.println("3. SPHERE:");
        System.out.println("   Radius: " + radius + " units");
        System.out.println("   Formula: V = (4/3)πr³");
        System.out.println("   Volume: " + String.format("%.2f", sphereVolume) + " cubic units\n");
        
        // Additional test cases
        System.out.println("========================================");
        System.out.println("        Additional Test Cases");
        System.out.println("========================================\n");
        
        // More examples
        System.out.println("Cube with side 3.5: " + String.format("%.2f", calculateVolume(3.5)) + " cubic units");
        System.out.println("Box with dimensions 10×5×2: " + String.format("%.2f", calculateVolume(10, 5, 2)) + " cubic units");
        System.out.println("Sphere with radius 2.5: " + String.format("%.2f", calculateVolume(2.5, "sphere")) + " cubic units");
    }
}
