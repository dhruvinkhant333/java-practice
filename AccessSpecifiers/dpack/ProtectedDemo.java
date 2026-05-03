package dpack;

import bpack.B;
import cpack.C;

// What is the purpose of this class? To demonstrate and compare accessibility across packages
public class ProtectedDemo {
    
    public static void main(String[] args) {
        
        System.out.println("=== Access Specifiers Demonstration ===");
        System.out.println("Understanding public, protected, and private access modifiers");
        
        // Question: Why create B with specific values? To show inherited access from A
        B objB = new B(100, 200, 300);
        objB.display();
        
        // Question: Why create C? To show that inheritance is different from object creation
        C objC = new C();
        objC.display();
        
        System.out.println("\n=== Summary ===");
        System.out.println("public: Accessible everywhere");
        System.out.println("protected: Accessible in same package and subclasses");
        System.out.println("private: Accessible only in the same class");
    }
}
