// Base class Shape
class Shape {
    protected double d1;
    protected double d2;
    
    // Method to initialize dimensions
    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class Triangle
class Triangle extends Shape {
    // Method to calculate area of triangle
    // Area = 0.5 * base * height
    public double calculateArea() {
        return 0.5 * d1 * d2;
    }
    
    public void displayArea() {
        System.out.println("Triangle dimensions: base = " + d1 + ", height = " + d2);
        System.out.println("Area of Triangle = " + calculateArea());
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    // Method to calculate area of rectangle
    // Area = length * width
    public double calculateArea() {
        return d1 * d2;
    }
    
    public void displayArea() {
        System.out.println("Rectangle dimensions: length = " + d1 + ", width = " + d2);
        System.out.println("Area of Rectangle = " + calculateArea());
    }
}

// Main class to test the program
public class Shape_Area_Calculation {
    public static void main(String[] args) {
        // Create Triangle object
        Triangle triangle = new Triangle();
        triangle.getData(10, 5);  // base = 10, height = 5
        triangle.displayArea();
        
        System.out.println();
        
        // Create Rectangle object
        Rectangle rectangle = new Rectangle();
        rectangle.getData(8, 6);  // length = 8, width = 6
        rectangle.displayArea();
        
        System.out.println();
        
        // Another example with Triangle
        Triangle triangle2 = new Triangle();
        triangle2.getData(15, 7);
        triangle2.displayArea();
        
        System.out.println();
        
        // Another example with Rectangle
        Rectangle rectangle2 = new Rectangle();
        rectangle2.getData(12, 9);
        rectangle2.displayArea();
    }
}
