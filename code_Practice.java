/*
1.4

Develop a Java application that calculates a person's Body Mass Index
(BMI). The program should ask the user for their weight in pounds
and height in inches. Convert these values to kilograms and meters
respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and
then calculate BMI (weight in kg / (height in meters)^2). Display the
calculated BMI.
*/

import java.util.Scanner;

public class code_Practice{
    public static void main( String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in pounds : ");
        double mass = scanner.nextDouble();

        System.out.println("Enter your height in inches : ");
        double height = scanner.nextDouble();

        double kg = mass *  0.45359237 ;
        double meter = height * 0.0254;
        
        double BMI = kg / (meter * meter ) ; 

        System.out.printf("your BMI : %.4f%n " , BMI);

        scanner.close();

    }
}