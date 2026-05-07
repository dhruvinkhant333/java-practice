package dpack;

import bpack.B;
import cpack.C;

/**
 * ProtectedDemo class with main method
 * Demonstrates access specifiers through different packages
 * Part of dpack package
 */
public class ProtectedDemo {
    
    /**
     * Main method to demonstrate access specifiers
     */
    public static void main(String[] args) {
        System.out.println("========== ACCESS SPECIFIERS DEMONSTRATION ==========\n");
        
        System.out.println("Q5.6: Access Specifiers in Different Packages\n");
        
        System.out.println("=== Summary of Access Specifiers ===");
        System.out.println("┌─────────────┬─────────┬──────────┬──────────┬─────────┐");
        System.out.println("│ Specifier   │ Same    │ Subclass │ Same Pkg │ Different Pkg │");
        System.out.println("│             │ Class   │ (Inherit)│          │              │");
        System.out.println("├─────────────┼─────────┼──────────┼──────────┼──────────────┤");
        System.out.println("│ public      │   ✓     │    ✓     │    ✓     │      ✓       │");
        System.out.println("│ protected   │   ✓     │    ✓     │    ✓     │      ✗       │");
        System.out.println("│ default     │   ✓     │    ✗     │    ✓     │      ✗       │");
        System.out.println("│ private     │   ✓     │    ✗     │    ✗     │      ✗       │");
        System.out.println("└─────────────┴─────────┴──────────┴──────────┴──────────────┘\n");
        
        // Create object of B (extends A from different package)
        B objB = new B(111, 222, 333);
        objB.display();
        
        // Create object of C (uses A from different package)
        C objC = new C();
        objC.display();
        
        System.out.println("\n========== CONCLUSION ==========");
        System.out.println("From above outputs:");
        System.out.println("• PUBLIC: Accessible everywhere");
        System.out.println("• PROTECTED: Accessible in subclasses and same package");
        System.out.println("• PRIVATE: Accessible only within the class");
        System.out.println("• DEFAULT: Accessible only within same package");
        System.out.println("===================================\n");
    }
}
