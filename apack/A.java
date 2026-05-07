package apack;

/**
 * Class A demonstrating access specifiers
 * Contains variables with different access levels
 */
public class A {
    // Public variable - accessible from anywhere
    public int pubVar;
    
    // Protected variable - accessible from subclasses and same package
    protected int protVar;
    
    // Private variable - accessible only within this class
    private int privVar;
    
    /**
     * Constructor to initialize all variables
     */
    public A(int pubVar, int protVar, int privVar) {
        this.pubVar = pubVar;
        this.protVar = protVar;
        this.privVar = privVar;
    }
    
    /**
     * Method to display all variables (accessible from anywhere)
     */
    public void displayAllVars() {
        System.out.println("Inside Class A:");
        System.out.println("  Public Variable: " + pubVar);
        System.out.println("  Protected Variable: " + protVar);
        System.out.println("  Private Variable: " + privVar);
    }
    
    /**
     * Getter method for private variable
     */
    public int getPrivVar() {
        return privVar;
    }
}
