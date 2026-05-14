 /* 
Define a Java class named Rectangle. It should have two double data
fields: width and height, both with a default value of 1. Implement a
no-argument constructor and a constructor that takes width and height
as parameters. Include methods getArea() and getPerimeter() that
return the calculated area and perimeter respectively.
*/


class Rectangle {

    private double width = 1.0;
    private double height = 1.0;


    public Rectangle() {

    }
    
    public Rectangle(double width , double height){

        this.width = width;
        this.height = height;

    }

    public double getArea() {

        return width*height;
    
    }

    public double getPerimeter() {
        return 2*(width + height);
    }
}

public class Rectangle_a_and_p {
    public static void main ( String [] args){

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4 ,40);

        System.out.println("area of r1 Rectangle : " + r1.getArea());
        System.out.println("perimeter of r1 Rectangle : " + r1.getPerimeter());

        System.out.println("area of r2 Rectangle : " + r2.getArea());
        System.out.println("perimeter of r2 Rectangle : " + r2.getPerimeter());
    }
}
 
