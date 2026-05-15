public class Rectangle {
    private double width;
    private double height;

    // No-argument constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Constructor with width and height parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate and return area
    public double getArea() {
        return width * height;
    }

    // Calculate and return perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // toString for easy display
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}