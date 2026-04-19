/*

2.  Write a Java program to solve a system of two linear equations with
    two variables (e.g., ax + by = e and cx + dy = f). Prompt the user to
    enter the coefficients a, b, c, d, e, f. Calculate and display the values of
    x and y using Cramer's rule. Include error handling for cases where
    the denominator is zero.
    Cramer's rule : D=ad-bc, Dx=ed-bf, Dy=af-ce, x=Dx/D, y=Dy/D 
    
*/

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve system: ax + by = e and cx + dy = f");

        System.out.println("Enter coefficient a : ");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b : ");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c : ");
        double c = scanner.nextDouble();

        System.out.println("Enter coefficient d : ");
        double d = scanner.nextDouble();

        System.out.println("Enter coefficient e : ");
        double e = scanner.nextDouble();

        System.out.println("Enter coefficient f : ");
        double f = scanner.nextDouble();

        double D = a * d - b * c; // Determinant

        if ( D == 0 ){

            System.out.println("Error: The system has no unique solution (denominator is zero).");
            System.out.println("The lines are either parallel or coincident.");

        }else{

            double Dx = e * d - b * f;
            double Dy = a * f - e * c;
            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("Solution: x = %.2f, y = %.2f%n", x, y);

        }
        scanner.close();

    }
}
