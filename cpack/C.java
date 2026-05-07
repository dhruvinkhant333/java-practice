package cpack;

import apack.A;

/**
 * Class C from cpack package
 * Demonstrates access specifiers through object creation and casting
 * Part of cpack package
 */
public class C {
    
    /**
     * Display method that tries to access variables of class A
     */
    public void display() {
        System.out.println("\n--- Class C from cpack ---");
        System.out.println("Accessing variables of class A through object:\n");
        
        // Create an object of class A
        A obj = new A(100, 200, 300);
        
        // Public variable - ACCESSIBLE
        System.out.println("✓ Public Variable: " + obj.pubVar);
        
        // Protected variable - NOT ACCESSIBLE (different package, not a subclass)
        // System.out.println("✗ Protected Variable: " + obj.protVar);  // COMPILATION ERROR
        System.out.println("✗ Protected Variable: [NOT ACCESSIBLE - different package, not a subclass]");
        
        // Private variable - NOT ACCESSIBLE
        // System.out.println("✗ Private Variable: " + obj.privVar);  // COMPILATION ERROR
        System.out.println("✗ Private Variable: [NOT ACCESSIBLE - private to class A]");
        
        // Show that we can only access public method
        System.out.println("\nCalling public method of A:");
        obj.displayAll();
    }
}
