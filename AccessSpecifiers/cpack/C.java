package cpack;

import apack.A;

// How is class C different from B? C does not inherit A, just creates an object of A
public class C {
    
    public void display() {
        System.out.println("\n--- Class C (uses object of A) ---");
        
        A objA = new A(10, 20, 30);
        
        // Can we access pubVar? Yes, public members are accessible from any package
        System.out.println("Accessing pubVar (public): " + objA.pubVar);
        
        // Can we access protVar? No, protected members are NOT accessible outside package unless inherited
        // The following line would cause compilation error if uncommented:
        // System.out.println("Accessing protVar (protected): " + objA.protVar);
        System.out.println("Accessing protVar (protected): NOT ACCESSIBLE - protected members not accessible outside package without inheritance");
        
        // Can we access privVar? No, private members are NEVER accessible outside the class
        // The following line would cause compilation error if uncommented:
        // System.out.println("Accessing privVar (private): " + objA.privVar);
        System.out.println("Accessing privVar (private): NOT ACCESSIBLE - private members cannot be accessed outside the class");
    }
}
