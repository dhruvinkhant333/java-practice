/*
1. Develop a Java program that prompts the user to enter a distance in
   meters. Your program should then convert this distance to feet (1
   meter = 3.28084 feet) and display the result formatted to two decimal
   places. 

*/


import java.util.Scanner;

public class Meter_to_feet{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in meter : ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;
        System.out.printf("Distance in feet: %.2f%n", feet);

        scanner.close();

    }

}