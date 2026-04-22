/*
Create a Point class representing a 2D point (x, y). Implement a
default constructor that initializes both x and y to 5. Provide a
parameterized constructor to initialize x and y with user-supplied
values. Also, implement a copy constructor to create a new Point
object as a copy of an existing Point object. Include a display()
method to show the point's coordinates and write a main method to
test all constructors and the display functionality.
*/

class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 5;
        this.y = 5;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Display method
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

    // Main method to test the constructors and display functionality
public class Points {
        public static void main(String[] args) {
            Point defaultPoint = new Point();
            // Testing default constructor
            
            defaultPoint.display(); // Should display (5, 5)
            Point paramPoint = new Point(10, 20);
            // Testing parameterized constructor
            
            paramPoint.display(); // Should display (10, 20)
            Point copyPoint = new Point(paramPoint);
            // Testing copy constructor
            copyPoint.display(); // Should display (10, 20)
        }
}