package bpack;

import apack.A;

// What is the advantage of inheritance here? B can access public and protected members of A
public class B extends A {
    
    public B(int pub, int prot, int priv) {
        super(pub, prot, priv);
    }
    
    public void display() {
        System.out.println("\n--- Class B (extends A) ---");
        
        // Can we access pubVar? Yes, public members are accessible everywhere
        System.out.println("Accessing pubVar (public): " + this.pubVar);
        
        // Can we access protVar? Yes, protected members are accessible in subclasses
        System.out.println("Accessing protVar (protected): " + this.protVar);
        
        // Can we access privVar? No, private members are NOT accessible even in subclasses
        // The following line would cause compilation error if uncommented:
        // System.out.println("Accessing privVar (private): " + this.privVar);
        System.out.println("Accessing privVar (private): NOT ACCESSIBLE - private members cannot be accessed in subclasses");
    }
}
