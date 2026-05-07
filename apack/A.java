package apack;

/**
 * Class A demonstrating different access specifiers
 * Part of apack package
 */
public class A {
    public int pubVar;           // Public variable - accessible everywhere
    protected int protVar;       // Protected variable - accessible in subclasses and same package
    private int privVar;         // Private variable - accessible only within this class
    
    /**
     * Constructor to initialize all three variables
     * @param pub - Value for public variable
     * @param prot - Value for protected variable
     * @param priv - Value for private variable
     */
    public A(int pub, int prot, int priv) {
        this.pubVar = pub;
        this.protVar = prot;
        this.privVar = priv;
    }
    
    /**
     * Method to display all variables (demonstrates private access)
     */
    public void displayAll() {
        System.out.println("    Inside Class A:");
        System.out.println("    Public Variable: " + pubVar);
        System.out.println("    Protected Variable: " + protVar);
        System.out.println("    Private Variable: " + privVar);
    }
}
