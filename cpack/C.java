package cpack;

import apack.A;

/**
 * Class C demonstrates accessing members of A from a different package
 * without inheritance
 */
public class C {
    
    /**
     * Display method to show which variables can be accessed
     * through object reference (without inheritance)
     */
    public void display() {
        System.out.println("\n========== CLASS C (no inheritance) ==========");
        System.out.println("Accessing Class A members without inheritance:");
        
        // Create object of class A
        A objA = new A(100, 200, 300);
        
        try {
            System.out.println("  ✓ Public Variable (pubVar): " + objA.pubVar);
            System.out.println("    → Accessible because it's public");
        } catch (Exception e) {
            System.out.println("  ✗ Public Variable: Not accessible");
        }
        
        try {
            // This will cause compilation error - cannot access protected variable
            // from different package without inheritance
            // System.out.println("  Protected Variable (protVar): " + objA.protVar);
            System.out.println("  ✗ Protected Variable (protVar): NOT ACCESSIBLE");
            System.out.println("    → Protected members are not accessible outside package");
            System.out.println("       (except through inheritance)");
        } catch (Exception e) {
            System.out.println("  ✗ Protected Variable: Not accessible");
        }
        
        try {
            // This will cause compilation error - cannot access private variable
            // System.out.println("  Private Variable (privVar): " + objA.privVar);
            System.out.println("  ✗ Private Variable (privVar): NOT ACCESSIBLE");
            System.out.println("    → Private members are never accessible outside the class");
            System.out.println("    → But we can use public getter: " + objA.getPrivVar());
        } catch (Exception e) {
            System.out.println("  ✗ Private Variable: Not accessible");
        }
    }
}
