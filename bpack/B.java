package bpack;

import apack.A;

/**
 * Class B extends A and demonstrates accessing inherited members
 * from a different package
 */
public class B extends A {
    
    /**
     * Constructor to initialize parent class
     */
    public B(int pubVar, int protVar, int privVar) {
        super(pubVar, protVar, privVar);
    }
    
    /**
     * Display method to show which variables can be accessed
     * through inheritance
     */
    public void display() {
        System.out.println("\n========== CLASS B (extends A) ==========");
        System.out.println("Accessing inherited members from Class A:");
        
        try {
            System.out.println("  ✓ Public Variable (pubVar): " + pubVar);
            System.out.println("    → Accessible because it's public");
        } catch (Exception e) {
            System.out.println("  ✗ Public Variable: Not accessible");
        }
        
        try {
            System.out.println("  ✓ Protected Variable (protVar): " + protVar);
            System.out.println("    → Accessible through inheritance");
        } catch (Exception e) {
            System.out.println("  ✗ Protected Variable: Not accessible");
        }
        
        try {
            // This will cause compilation error - cannot access private variable
            // System.out.println("  Private Variable (privVar): " + privVar);
            System.out.println("  ✗ Private Variable (privVar): NOT ACCESSIBLE");
            System.out.println("    → Private members are not inherited");
            System.out.println("    → But we can use getter: " + getPrivVar());
        } catch (Exception e) {
            System.out.println("  ✗ Private Variable: Not accessible");
        }
    }
}
