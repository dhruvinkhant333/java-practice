/* 
3.  Develop a Java application that calculates a person's Body Mass Index
(BMI). The program should ask the user for their weight in pounds
and height in inches. Convert these values to kilograms and meters
respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and
then calculate BMI (weight in kg / (height in meters)^2). Display the
calculated BMI.
*/

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();

        // Conversion constants
        double poundsToKg = 0.45359237;
        double inchesToMeters = 0.0254;

        // Convert to metric
        double weightKg = weightPounds * poundsToKg;
        double heightMeters = heightInches * inchesToMeters;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.4f%n", bmi);

        scanner.close();
    }

    
}
