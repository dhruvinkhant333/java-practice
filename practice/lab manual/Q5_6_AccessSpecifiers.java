/**
 * QUESTION 5.6: Access Specifiers Across Packages
 * 
 * This program demonstrates the use of four different packages to show
 * how access specifiers (public, protected, private) work across packages
 * and with inheritance.
 * 
 * ═══════════════════════════════════════════════════════════════════════
 * PACKAGE STRUCTURE:
 * ═══════════════════════════════════════════════════════════════════════
 * 
 * 1. PACKAGE: apack
 *    ─────────────────────────────────────────────────────────────────
 *    Class: A
 *    - public int pubVar          (accessible everywhere)
 *    - protected int protVar      (accessible in subclasses & same package)
 *    - private int privVar        (accessible only in this class)
 *    
 *    Methods:
 *    - Constructor to initialize variables
 *    - displayAllVars() to display all variables
 *    - getPrivVar() getter for private variable
 * 
 * 2. PACKAGE: bpack
 *    ─────────────────────────────────────────────────────────────────
 *    Class: B extends A
 *    - Demonstrates inheritance from A (different package)
 *    - display() method shows which variables are accessible through inheritance
 *    
 *    Accessibility in Class B:
 *    ✓ Can access pubVar       (public)
 *    ✓ Can access protVar      (protected - inherited)
 *    ✗ Cannot access privVar   (private - not inherited)
 * 
 * 3. PACKAGE: cpack
 *    ─────────────────────────────────────────────────────────────────
 *    Class: C
 *    - Does NOT extend A
 *    - Creates object of A and tries to access its variables
 *    - display() method shows which variables are accessible without inheritance
 *    
 *    Accessibility in Class C:
 *    ✓ Can access pubVar       (public)
 *    ✗ Cannot access protVar   (protected - requires inheritance)
 *    ✗ Cannot access privVar   (private)
 * 
 * 4. PACKAGE: dpack
 *    ─────────────────────────────────────────────────────────────────
 *    Class: ProtectedDemo
 *    - main() method is the entry point
 *    - Creates objects of B and C
 *    - Calls their display() methods
 *    - Shows comparison table of access specifiers
 * 
 * ═══════════════════════════════════════════════════════════════════════
 * ACCESS SPECIFIER VISIBILITY TABLE:
 * ═══════════════════════════════════════════════════════════════════════
 * 
 *                    Same    Same      Different   Different
 * Access Level       Class   Package   Package     Package
 *                                      (object)    (subclass)
 * ─────────────────────────────────────────────────────────────────
 * public      ✓       ✓        ✓          ✓           ✓
 * protected   ✓       ✓        ✓          ✗           ✓
 * default     ✓       ✓        ✓          ✗           ✗
 * private     ✓       ✗        ✗          ✗           ✗
 * 
 * ═══════════════════════════════════════════════════════════════════════
 * COMPILATION AND EXECUTION:
 * ═══════════════════════════════════════════════════════════════════════
 * 
 * Navigate to: d:\study\coding\java
 * 
 * Step 1: Compile all Java files
 *         javac apack\A.java bpack\B.java cpack\C.java dpack\ProtectedDemo.java
 * 
 * Step 2: Run the main class
 *         java dpack.ProtectedDemo
 * 
 * ═══════════════════════════════════════════════════════════════════════
 * KEY LEARNING POINTS:
 * ═══════════════════════════════════════════════════════════════════════
 * 
 * 1. PUBLIC ACCESS:
 *    - Can be accessed from anywhere
 *    - Works with inheritance and object reference
 * 
 * 2. PROTECTED ACCESS:
 *    - Accessible in the same package
 *    - Accessible in subclasses (even different packages)
 *    - NOT accessible through object reference in different package
 * 
 * 3. PRIVATE ACCESS:
 *    - Only accessible within the class
 *    - NOT inherited by subclasses
 *    - Must use public getter methods to access
 * 
 * 4. DEFAULT ACCESS (no modifier):
 *    - Accessible only within the same package
 *    - NOT available for inheritance across packages
 * 
 * ═══════════════════════════════════════════════════════════════════════
 */
