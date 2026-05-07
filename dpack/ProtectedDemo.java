package dpack;

import bpack.B;
import cpack.C;

/**
 * Class ProtectedDemo with main method
 * Demonstrates access specifiers across packages
 * Question 5.6
 */
public class ProtectedDemo {
    
    /**
     * Main method to demonstrate access specifier usage
     */
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║   DEMONSTRATING ACCESS SPECIFIERS ACROSS PACKAGES (Q5.6)   ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        
        System.out.println("\n🔍 SCENARIO 1: Class B (subclass of A in different package)");
        System.out.println("─────────────────────────────────────────────────────────────");
        // Create object of class B (which extends A)
        B objB = new B(10, 20, 30);
        objB.display();
        
        System.out.println("\n🔍 SCENARIO 2: Class C (uses A without inheritance)");
        System.out.println("─────────────────────────────────────────────────────────────");
        // Create object of class C
        C objC = new C();
        objC.display();
        
        System.out.println("\n\n═════════════════════════════════════════════════════════════");
        System.out.println("                    SUMMARY OF ACCESS SPECIFIERS");
        System.out.println("═════════════════════════════════════════════════════════════");
        System.out.println("\n┌─────────────────┬──────────┬──────────┬─────────┬──────────┐");
        System.out.println("│  Access Level   │  Same    │  Same    │Different│Different │");
        System.out.println("│                 │ Class    │ Package  │Package  │Package   │");
        System.out.println("│                 │          │(subclass)│(object) │(subclass)│");
        System.out.println("├─────────────────┼──────────┼──────────┼─────────┼──────────┤");
        System.out.println("│  public         │   ✓      │    ✓     │    ✓    │    ✓     │");
        System.out.println("│  protected      │   ✓      │    ✓     │    ✗    │    ✓     │");
        System.out.println("│  default(none)  │   ✓      │    ✓     │    ✗    │    ✗     │");
        System.out.println("│  private        │   ✓      │    ✗     │    ✗    │    ✗     │");
        System.out.println("└─────────────────┴──────────┴──────────┴─────────┴──────────┘");
        
        System.out.println("\n📋 KEY OBSERVATIONS:");
        System.out.println("   • Public (public) - Accessible everywhere");
        System.out.println("   • Protected (protected) - Accessible in same package & subclasses");
        System.out.println("   • Default (no modifier) - Accessible in same package only");
        System.out.println("   • Private (private) - Accessible only within the class");
        System.out.println("═════════════════════════════════════════════════════════════\n");
    }
}
