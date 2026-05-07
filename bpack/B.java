package bpack;

import apack.A;

/**
 * Class B that extends A from apack package
 * Demonstrates access specifiers through inheritance
 * Part of bpack package
 */
public class B extends A {
    
    /**
     * Constructor that calls parent class constructor
     * @param pub - Value for public variable
     * @param prot - Value for protected variable
     * @param priv - Value for private variable
     */
    public B(int pub, int prot, int priv) {
        super(pub, prot, priv);  // Call parent class constructor
    }
    
    /**
     * Display method that tries to access variables of A using inheritance
     */
    public void display() {
        System.out.println("\n--- Class B (extends A) from bpack ---");
        System.out.println("Accessing inherited variables:\n");
        
        // Public variable - ACCESSIBLE
        System.out.println("✓ Public Variable: " + pubVar);
        
        // Protected variable - ACCESSIBLE (because B extends A)
        System.out.println("✓ Protected Variable: " + protVar);
        
        // Private variable - NOT ACCESSIBLE (will cause compilation error if uncommented)
        // System.out.println("✗ Private Variable: " + privVar);  // COMPILATION ERROR
        System.out.println("✗ Private Variable: [NOT ACCESSIBLE - private to class A]");
    }
}
